package org.ncu.spring_mvc_app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class LoginController {
	
@ModelAttribute("login")	public Login getUser() {
		
		return new Login();
	}
	
	@RequestMapping("/showloginform")
	public String func() 
	{
		return "showloginform";
	}
	@RequestMapping("/processlogin")
	public RedirectView func2(@ModelAttribute("login") Login login,BindingResult br, Model mode) 
	{
		if(login.getType().equals("Customer")) 
		{
			if(login.getUser().equals(login.getPassword())) 
			{
				
				return new RedirectView("/spring_mvc_app/customerpage");
			}
			else return new RedirectView("/spring_mvc_app/showloginform");
		}
		else if(login.getType().equals("Seller")) 
		{
			String pass=login.getUser()+"seller";
			if(login.getPassword().equals(pass)) 
			{
				return new RedirectView("/spring_mvc_app/showseller");
				
			}
			else return new RedirectView("/spring_mvc_app/showloginform");
		}
		
		else return new RedirectView("/spring_mvc_app/");
		
	}
}
