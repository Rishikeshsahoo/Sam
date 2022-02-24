package org.ncu.spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

	@RequestMapping("/inputForm")
	public String inputForm() 
	{
		return "inputForm";
	}
	
}
