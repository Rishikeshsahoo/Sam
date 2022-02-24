package org.ncu.spring_mvc;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@RequestMapping("/inputForm")
	public String inputForm() 
	{
		return "inputForm";
	}
	@RequestMapping("/processForm")
	public String processForm(@RequestParam("sam")List<String> sam,HttpServletRequest req, Model model) 
	{
		List<String> list=sam;
		String chString=req.getParameter("sex");
		System.out.println(chString);
		String nameString=req.getParameter("fname");
		String newNameString="";
		if(chString.equals("M"))newNameString="Mr. "+nameString;
		else if(chString.equals("F"))newNameString="Mrs. "+nameString;
		else newNameString=nameString;
		String string=req.getParameter("text");
		model.addAttribute("newName",newNameString);
		model.addAttribute("text",string);
		model.addAttribute("list",list);

		
		return "processForm";
	}
}
