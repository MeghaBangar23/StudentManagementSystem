package com.studentmanage.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.studentmanage.model.Admin;
import com.studentmanage.service.AdminService;
@Controller
public class AdminController
{
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/loginForm")
	public String login() 
	{
		return "login";
	}
	
	@GetMapping("/validate")
	public String validation(@RequestParam("username") String userName, @RequestParam("password") String pass) 
	{
		String usNm="";
		String pswd="";
		List<Admin> admin=adminService.getAllAdmin();
		for(Admin a:admin) 
		{
			
			usNm=a.getUserName();
			pswd=a.getPassword();
			if(userName.equalsIgnoreCase(usNm) && pass.equalsIgnoreCase(pswd)) 
			{
				return "HomePage";	
			}	
		}
		
		return "login";
		
	}
	
	
	

}
