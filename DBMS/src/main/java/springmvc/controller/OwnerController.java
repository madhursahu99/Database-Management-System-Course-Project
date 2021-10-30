package springmvc.controller;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.dao.OwnerDao;
import springmvc.model.Complaint;
import springmvc.model.Employees;
import springmvc.model.Owner;
import springmvc.model.Pharmacist;
import springmvc.model.Stores;

@Controller
public class OwnerController {
	
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
	private OwnerDao ownerDao;
	
	@RequestMapping("/owner")
	public String showform() {
		return "owner";
	}
	
	@RequestMapping(path="/ownerlogin" , method=RequestMethod.POST)
	public String reg(@ModelAttribute("owner") Owner owner ,HttpSession session, Model model) {
		System.out.println(owner);
		Owner o=this.ownerDao.loginOwner(owner);
		if(o==null)
			return "redirect:/owner";
		else
		{
			String uname=owner.getUsername();
			session.setAttribute("uname",uname);
			return "OwnerWindow";
		}
	}
	
	@RequestMapping("/ownerwindow")
	public String ownerwindow() {
		return "OwnerWindow";
	}
	
	@RequestMapping("/empregform")
	public String showempform(HttpSession session) {
		if(session.getAttribute("uname")==null)
			return "redirect:/owner";
		else
		{
			return "emp-reg";
		}
	}
	
	@RequestMapping(path="/addemp", method =RequestMethod.POST)
	public String addemp(@ModelAttribute("emp") Employees emp , Model model,HttpSession session) {
		
		if(session.getAttribute("uname")==null)
			return "redirect:/owner";
		
		String pass=emp.getPassword();
		String pword=encode(pass);
		emp.setPassword(pword);
		int i=(Integer)this.ownerDao.addEmp(emp);
		if(i==1)
			return "empadded";
		else
			return "redirect:/empregform";
	}
	
	@RequestMapping(path="/showall")
	public String showall(Model model,HttpSession session) {
		
		if(session.getAttribute("uname")==null)
			return "redirect:/owner";
		
		List<Employees> emp=this.ownerDao.showall();
		int size=emp.size();
		model.addAttribute("size", size); 
		model.addAttribute("emp",emp);
		System.out.println(emp);
		if(emp==null)
			return "OwnerWindow";
		else
			return "allemp";
	}
	
	@RequestMapping("/upd_sal_form")
	public String showupdform(HttpSession session) {
		
		if(session.getAttribute("uname")==null)
			return "redirect:/owner";
		
		return "upd_sal";
	}
	
	@RequestMapping(path="/upd_sal", method=RequestMethod.POST)
	public String upd_sal(@RequestParam("id")int id ,@RequestParam("salary")int salary,HttpSession session) {
		
		if(session.getAttribute("uname")==null)
			return "redirect:/owner";
		
		int emp=this.ownerDao.upd_sal(id,salary);
		if(emp==0)
			return "OwnerWindow";
		else
			return "salupdated";
	}
	
	@RequestMapping(path="/del_emp", method=RequestMethod.POST)
	public String del_emp(@RequestParam("id") int id ,HttpSession session) {
		
		if(session.getAttribute("uname")==null)
			return "redirect:/owner";
		Employees emp=this.ownerDao.searchbyid(id);
		if(emp==null)
			return "nosuchemp";
		
		
		else
		{
			int e=this.ownerDao.del_emp(id);
			return "empdeleted";
		}
	}
	
	@RequestMapping(path="/showallbs")
	public String showallbs(@RequestParam("id") int sid,Model model , HttpSession session) {
		
		if(session.getAttribute("uname")==null)
			return "redirect:/owner";
		
		List<Employees> emp=this.ownerDao.showallbs(sid);
		int size=emp.size();
		model.addAttribute("size", size); 
		model.addAttribute("emp",emp);
		if(emp==null)
			return "nosuchstore";
		else
			return "allempbs";
	}
	
	@RequestMapping(path="/searchbyid" , method=RequestMethod.POST)
	public String searchbyid(@RequestParam("id") int id, Model model , HttpSession session) {
		
		if(session.getAttribute("uname")==null)
			return "redirect:/owner";
		
		Employees emp=this.ownerDao.searchbyid(id);
		model.addAttribute("e",emp);
		if(emp==null)			
			return "nosuchemp";
		else
			return "empdetail";
	}
	
	@RequestMapping(path="/showcom")
	public String showcom( Model model , HttpSession session) {
		
		if(session.getAttribute("uname")==null)
			return "redirect:/owner";
		
		List<Complaint> com=this.ownerDao.showcom();
		model.addAttribute("com",com);
		if(com==null)			
			return "OwnerWindow";
		else
			return "complaints";
	}
	
	@RequestMapping(path="/showpha")
	public String showpha( Model model , HttpSession session) {
		
		if(session.getAttribute("uname")==null)
			return "redirect:/owner";
		
		List<Pharmacist> pha=this.ownerDao.showpha();
		model.addAttribute("pha",pha);
		if(pha==null)			
			return "OwnerWindow";
		else
			return "Pharmacists";
	}
	
	@RequestMapping(path="/addstoref")
	public String addst( Model model , HttpSession session) {
		
		if(session.getAttribute("uname")==null)
			return "redirect:/owner";
		
		return "addstore";
	}
	
	@RequestMapping(path="/addstore",method=RequestMethod.POST)
	public String addst(@ModelAttribute("Stores") Stores store, Model model , HttpSession session) {
		
		if(session.getAttribute("uname")==null)
			return "redirect:/owner";
		
		this.ownerDao.addstore(store);
		return "storeadded";
	}
	
	@RequestMapping("/pharegform")
	public String showphaform(HttpSession session) {
		if(session.getAttribute("uname")==null)
			return "redirect:/owner";
		else
		{
			return "pha-reg";
		}
	}
	
	@RequestMapping(path="/addpha", method =RequestMethod.POST)
	public String addemp(@ModelAttribute("pha") Pharmacist pha , Model model,HttpSession session) {
		
		if(session.getAttribute("uname")==null)
			return "redirect:/owner";
		System.out.println(pha);
		String pass=pha.getPassword();
		String pword=encode(pass);
		pha.setPassword(pword);
		int i=(Integer)this.ownerDao.addpha(pha);
		if(i==1)
			return "phaadded";
		else
			return "redirect:/pharegform";
	}
	
	@RequestMapping(path="/ownerlogout")
	public String ownerlogout(HttpSession session) {
		
		if(session.getAttribute("uname")==null)
			return "redirect:/owner";
		
		session.removeAttribute("uname");
		return "index";
	}
	
	

}
