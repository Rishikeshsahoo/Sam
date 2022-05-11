package com.ncu.test2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ncu.test2.DAO.StudentDAO;
import com.ncu.test2.Enitiy.Student;

@Controller
@Component
public class StudentController {
	
	@Autowired
	StudentDAO studentDAO;
	
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
	
//	@RequestMapping(value="/processForm", method = RequestMethod.POST )
//	public String processform(@RequestParam("studentName") String name,@ModelAttribute("student") Student stu,Model model) 
//	{
//		model.addAttribute("stu",stu);
//		System.out.println(name);
//		return "processform";
//	}
//	
	@RequestMapping(value="/processForm", method = RequestMethod.POST )
	public String processform(@RequestParam("studentName") String name,@ModelAttribute("student") Student stu,Model model) 
	{
		studentDAO.createRecord(stu);
		List<Student> listt=studentDAO.loadStudents();
		System.out.println(listt);
		model.addAttribute("li",listt);
		System.out.println(name);
		return "processform";
	}
}
