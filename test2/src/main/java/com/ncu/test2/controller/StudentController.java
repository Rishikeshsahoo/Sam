package com.ncu.test2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ncu.test2.Enitiy.Student;

@Controller
public class StudentController {
	
	@ModelAttribute("student")
	public Student getStudent() 
	{
		return new Student();
	}
	

	@RequestMapping("/StudentForm")
	public String showstudent() 
	{
		return "studentform";
	}
	@RequestMapping(value="/processForm", method = RequestMethod.POST )
	public String processform(@RequestParam("studentName") String name,@ModelAttribute("student") Student stu,Model model) 
	{
		model.addAttribute("stu",stu);
		System.out.println(name);
		return "processform";
	}
}
