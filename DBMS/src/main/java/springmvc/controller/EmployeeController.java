package springmvc.controller;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.dao.EmployeeDao;
import springmvc.model.Employees;
import springmvc.model.Medicine;
import springmvc.model.Orders;

@Controller
public class EmployeeController {
	
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
	private EmployeeDao empdao;
	
	@RequestMapping("/employeelogin")
	public String showform() {
		return "emp-login";
	}

	@RequestMapping(path="/processlogin", method=RequestMethod.POST)	
	public String login(@RequestParam("username") String uname, @RequestParam("password") String pass,Model model,HttpSession session) {
		String pword=encode(pass);
		Employees emp=this.empdao.login(uname , pword);
		if(emp==null)
			return "redirect:/employeelogin";
		else
		{
			session.setAttribute("empid",emp.getEmployeeID());
			session.setAttribute("sid", emp.getStoreID());
			System.out.println(emp);
			return "EmpWindow";
		}
	}
	
	@RequestMapping("/empwindow")
	public String ownerwindow(HttpSession session) {
		if(session.getAttribute("empid")==null)
			return "redirect:/employeelogin";
		return "EmpWindow";
	}
	
	@RequestMapping(path="/showallmed")	
	public String showallmed(Model model , HttpSession session) {
		
		if(session.getAttribute("empid")==null)
			return "redirect:/employeelogin";
		
		List<Medicine> med=this.empdao.showallmed();
		int size=med.size();
		model.addAttribute("size", size); 
		model.addAttribute("med",med);
		if(med==null)
			return "EmpWindow";
		else
			return "allmed";
	}
	
	@RequestMapping(path="/showallmedbs", method=RequestMethod.POST)
	public String showallmedbs(@RequestParam("id") int sid,Model model , HttpSession session) {
		
		if(session.getAttribute("empid")==null)
			return "redirect:/employeelogin";
		
		List<Medicine> med=this.empdao.showallmedbs(sid);
		int size=med.size();
		model.addAttribute("size", size); 
		model.addAttribute("med",med);
		if(med==null)
			return "EmpWindow";
		else
			return "allmedbs";
	}
	
	@RequestMapping("/upd_price_form" )
	public String showupdform(HttpSession session) {
		
		if(session.getAttribute("empid")==null)
			return "redirect:/employeelogin";
		
		return "upd_price";
	}
	
	@RequestMapping(path="/upd_price", method=RequestMethod.POST)
	public String upd_price(@RequestParam("id")int id ,@RequestParam("price")int price , HttpSession session) {
		
		if(session.getAttribute("empid")==null)
			return "redirect:/employeelogin";
		
		int med=this.empdao.upd_price(id,price);
		if(med==0)
			return "EmpWindow";
		else
			return "priceupdated";
	}
	
	@RequestMapping(path="/del_med", method=RequestMethod.POST)
	public String del_med(int id , HttpSession session) {
		
		if(session.getAttribute("empid")==null)
			return "redirect:/employeelogin";
		
		int emp=this.empdao.del_med(id);
		if(emp==0)
			return "EmpWindow";
		else
			return "meddeleted";
	}
	
	@RequestMapping("/medaddform")
	public String showempform(HttpSession session) {
		
		if(session.getAttribute("empid")==null)
			return "redirect:/employeelogin";
		
		return "med-add";
	}
	
	@RequestMapping(path="/addmed", method =RequestMethod.POST)
	public String addmed(@ModelAttribute("med") Medicine med , Model model , HttpSession session) {
		
		if(session.getAttribute("empid")==null)
			return "redirect:/employeelogin";
		System.out.println("d");
		System.out.println(med);
		int i=(Integer)this.empdao.addmed(med);
		if(i==1)
			return "medadded";
		else
			return "EmpWindow";
	}
	
	@RequestMapping(path="/searchmedbyid" , method=RequestMethod.POST)
	public String searchmedbyid(@RequestParam("id") int id, Model model,HttpSession session) {
		
		if(session.getAttribute("empid")==null)
			return "redirect:/employeelogin";
		
		Medicine med=this.empdao.searchmedbyid(id);
		model.addAttribute("med",med);
		if(med==null)			
			return "EmpWindow";
		else
			return "meddetail1";
	}
	
	@RequestMapping("/storeorders")
	public String storeorders(HttpSession session,Model model) {
		
		if(session.getAttribute("empid")==null)
			return "redirect:/employeelogin";
		int sid=(Integer)session.getAttribute("sid");
		List<Orders> o=this.empdao.storeorders(sid);
		if(o==null)
			return "sthwentwrong";
		else
		{
			int size=o.size();
			model.addAttribute("orders", o);
			model.addAttribute("size", size);
			return "storeorders";
		}	
	}
	
	@RequestMapping("/updateempprofile")
	public String updateempprofile(HttpSession session,Model model) {
		
		if(session.getAttribute("empid")==null)
			return "redirect:/employeelogin";
		int id=(Integer)session.getAttribute("empid");
		System.out.println(id);
		Employees emp=this.empdao.getprofile(id);
		
		System.out.println(emp);
		model.addAttribute("emp", emp);
		return "updateempprofile";
	}
	
	@RequestMapping("/updempprofile")
	public String updempprofile(@RequestParam("FirstName")String fname,@RequestParam("LastName") String lname, @RequestParam("email") String email
		,@RequestParam("joining_date") String jdate,@RequestParam("phone_number")String ph,@RequestParam("username")String uname,HttpSession session,Model model) {
		
		if(session.getAttribute("empid")==null)
			return "redirect:/employeelogin";
		int id=(Integer)session.getAttribute("empid");
		System.out.println(ph);
		this.empdao.updprofile(id,fname,lname,email,uname,ph,jdate);
		
		return "profileupdated";
	}
	
	@RequestMapping(path="/emplogout")
	public String emplogout(HttpSession session) {
		
		if(session.getAttribute("empid")==null)
			return "redirect:/employeelogin";
		
		session.removeAttribute("empid");
		session.removeAttribute("sid");
		return "index";
	}

}
