package springmvc.controller;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.dao.CustomerDao;
import springmvc.dao.EmployeeDao;
import springmvc.model.Address;
import springmvc.model.Cart;
import springmvc.model.Complaint;
import springmvc.model.Customer;
import springmvc.model.Medicine;
import springmvc.model.Orders;
import springmvc.model.Stores;

@Controller
public class RegistrationController {
	
	public String bytesToHex(byte bytes[]) {
		StringBuilder sb = new StringBuilder();
		for (byte b : bytes) {
			sb.append(String.format("%02x", b));
		}
		return sb.toString();
	}


	public String encode(String password) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-256");
			byte[] result= md.digest(password.getBytes(StandardCharsets.UTF_8));
			String hex= bytesToHex(result);
			
			return hex;

		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}


	}
	
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private EmployeeDao empdao;
	
	@RequestMapping("/user-registration")
	public String showform() {
		return "new-user-registration";
	}
	
	@RequestMapping(path="/registeruser" , method=RequestMethod.POST)
	public String reg(@RequestParam("FirstName") String fname ,@RequestParam("LastName") String lname, @RequestParam("username") String uname,
			@RequestParam("password") String pass,@RequestParam("gender") String gender,@RequestParam("age") int age
			,@RequestParam("phone_no") String pno,@RequestParam("email") String email,Model model,ModelMap m) {
		
		String encpword=encode(pass);
		List<Customer> c=this.customerDao.checkforemail(email);
		if(c==null)
		{
			return "sthwentwrong";
		}
		int size=c.size();
		if(size>0)
		{
			m.put("err","Email is already registered");
			return "new-user-registration";
		}
		else
		{
			this.customerDao.saveCustomer(fname,lname,uname,encpword,gender,age,pno,email);
			return "home";
		}
	}

	


	@RequestMapping("/customerlogin")
	public String showloginform() {
		System.out.print("c");
		return "customerlogin";
	}
	
	@RequestMapping(path="/custLogin" , method=RequestMethod.POST)
	public String custlogin(@RequestParam("username") String uname, @RequestParam("password") String pass , Model model,
			HttpSession session) {
		System.out.print("c");
		String pword=encode(pass);
		Customer c=this.customerDao.login(uname,pword);
		if(c==null)
			return "redirect:/customerlogin";
		else {
			session.setAttribute("id",c.getCustomerID());
			return "custwindow";
		}
	}
	
	@RequestMapping("/cuswindow")
	public String custhome()
	{
		return "custwindow";
	}
	
	@RequestMapping(path="/showallmedc")	
	public String showallmed(Model model,HttpSession session) {
		
		if(session.getAttribute("id")==null)
			return "redirect:/customerlogin";
		
		List<Medicine> med=this.empdao.showallmed();
		int size=med.size();
		model.addAttribute("size", size); 
		model.addAttribute("med",med);
		if(med==null)
			return "custwindow";
		else
			return "allmedc";
	}
	
	@RequestMapping("/complaint_form")
	public String complaintform(HttpSession session){

		if(session.getAttribute("id")==null)
			return "redirect:/customerlogin";
		
		return "com-form";
		
	}
	
	@RequestMapping(path="/complaint" , method=RequestMethod.POST)
	public String complaint(@ModelAttribute("complaint") Complaint com , Model model , HttpSession session){

		if(session.getAttribute("id")==null)
			return "redirect:/customerlogin";
		
		int id=(Integer)session.getAttribute("id");
		this.customerDao.file_com(com,id);
		return "com_registered";
	}
	
	@RequestMapping(path="/showstores")	
	public String showstore(Model model , HttpSession session) {
		

		if(session.getAttribute("id")==null)
			return "redirect:/customerlogin";
		
		List< Stores> store=this.customerDao.showstores();
		int size=store.size();
		model.addAttribute("size", size); 
		model.addAttribute("store",store);
		if(store==null)
			return "cWindow";
		else
			return "allstore";
	}
	
	@RequestMapping(path="/addtocart/{medicineId}/{medname}/{sid}" , method=RequestMethod.POST)
	public String addtoc(@PathVariable("medicineId") int mid,@PathVariable("medname") String medname,@PathVariable("sid")int sid, @RequestParam("quantity") int q,Model model , HttpSession session  ) {
		if(session.getAttribute("id")==null)
			return "redirect:/customerlogin";
		System.out.println("cc");
		System.out.println(mid);
		int cid=(Integer)session.getAttribute("id");
		Medicine m=this.customerDao.searchmedbyid(mid);
		System.out.println(m);
		int price=m.getPrice();
		int tprice=price*q;
		int i=this.customerDao.atc(cid,mid,q,tprice,sid);
		if(i==1)
			return "addedtocart";
		else
		{
			this.customerDao.atcexist(cid,mid,q,tprice,sid,price);
			return "addedtocart";
		}
		
	}
	
	@RequestMapping(path="/searchmedebyid",method=RequestMethod.POST)
	public String searchmedebyid(@RequestParam("id") int id,Model model,HttpSession session)
	{
		if(session.getAttribute("id")==null)
			return "redirect:/customerlogin";
		Medicine med=this.customerDao.searchmedbyid(id);
		model.addAttribute("med",med);
		if(med==null)
			return "nomed";
		else
			return "meddetail";
	}
	
	@RequestMapping(path="/viewcart")
	public String viewcart(Model model,HttpSession session)
	{
		if(session.getAttribute("id")==null)
			return "redirect:/customerlogin";
		
		List<Cart> cart=this.customerDao.showcart((Integer)session.getAttribute("id"));
		model.addAttribute("size",cart.size());
		model.addAttribute("cart",cart);
		int tprice=0;
		for(Cart c:cart)
		{
			tprice+=c.getPrice();
		}
		model.addAttribute("tprice",tprice);
		return "cart";
	}
	
	@RequestMapping(path="/delfromcart/{mid}/{cid}")
	public String delfromcart(@PathVariable("mid")int mid,@PathVariable("cid") int cid ,HttpSession session,Model model) {
		
		if(session.getAttribute("id")==null)
			return "redirect:/customerlogin";
		
		this.customerDao.delfromcart(mid,cid);
		return "redirect:/viewcart";
	}
	
	@RequestMapping("/placeorder")
	public String placeorder(HttpSession session) {
		
		if(session.getAttribute("id")==null)
			return "redirect:/customerlogin";
		
		int id=(Integer)session.getAttribute("id");
		List<Cart> cart=this.customerDao.showcart(id);
		this.customerDao.emptycart(id);
		
		for(Cart c:cart)
		{
			this.customerDao.movetoorders(c.getCustomerID(),c.getMedicineID(),c.getQuantity(),c.getStoreID(),c.getPrice());
		}
		
		return "invoice";
	}
	
	@RequestMapping(path="/vieworders")
	public String vieworders(Model model,HttpSession session)
	{
		if(session.getAttribute("id")==null)
			return "redirect:/customerlogin";
		int id=(Integer)session.getAttribute("id");
		System.out.println("m");
		List<Orders> o=this.customerDao.vieworder(id);
		System.out.println(id);
		System.out.println(o);
		System.out.println("m");
		int size=o.size();
		model.addAttribute("size",size);
		model.addAttribute("order", o);
		return "myorders";
	}
	
	@RequestMapping(path="/upd_profile")
	public String profile(Model model,HttpSession session)
	{
		if(session.getAttribute("id")==null)
			return "redirect:/customerlogin";
		int custid=(Integer)session.getAttribute("id");
		Customer c=this.customerDao.getcust(custid);
		model.addAttribute("cust",c);
		return "custprofile";
	}
	
	@RequestMapping(path="/addaddressf")
	public String addaddressf(Model model,HttpSession session)
	{
		if(session.getAttribute("id")==null)
			return "redirect:/customerlogin";
		
		return "addaddress";
		
	}
	
	@RequestMapping(path="/addaddress",method=RequestMethod.POST)
	public String addaddress(@ModelAttribute("address") Address ad,Model model,HttpSession session)
	{
		if(session.getAttribute("id")==null)
			return "redirect:/customerlogin";
		int custid=(Integer)session.getAttribute("id");
		int addid=this.customerDao.saveaddress(ad);
		this.customerDao.insertaddid(addid,custid);
		return "addsuccess";
		
	}
	
	@RequestMapping(path="/updaddressf")
	public String updaddressf(Model model,HttpSession session)
	{
		if(session.getAttribute("id")==null)
			return "redirect:/customerlogin";
		int cid=(Integer)session.getAttribute("id");
		Customer c=this.customerDao.getcust(cid);
		int addid=c.getAddressID();
		Address add=this.customerDao.getadd(addid);
		model.addAttribute("add",add);
		System.out.println(add);
		return "updaddress";
		
	}
	
	@RequestMapping(path="/updaddress",method=RequestMethod.POST)
	public String updaddress(@ModelAttribute("address") Address ad,Model model,HttpSession session)
	{
		if(session.getAttribute("id")==null)
			return "redirect:/customerlogin";
		int custid=(Integer)session.getAttribute("id");
		Customer c=this.customerDao.getcust(custid);
		int addid=c.getAddressID();
		System.out.println(ad);
		int ai=this.customerDao.updaddress(ad,addid);
		return "addsuccess";
		
	}
	
	@RequestMapping(path="/updcustprofile",method=RequestMethod.POST)
	public String updcustprofile(@RequestParam("FirstName")String fname,@RequestParam("LastName") String lname
			,@RequestParam("age") String age,@RequestParam("phone_no")String ph,@RequestParam("username")String uname,Model model,HttpSession session)
	{
		if(session.getAttribute("id")==null)
			return "redirect:/customerlogin";
		int custid=(Integer)session.getAttribute("id");
		int ai=this.customerDao.updcustprofile(fname,lname,age,ph,uname,custid);
		return "custprofileupdated";
		
	}
	
	@RequestMapping(path="/customerlogout")
	public String cuslogout(HttpSession session) {
		
		if(session.getAttribute("id")==null)
			return "redirect:/customerlogin";
		
		session.removeAttribute("id");
		return "index";
	}
	

}
