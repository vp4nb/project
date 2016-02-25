package com.bellinfo.exam.student.control;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bellinfo.exam.model.Student;
import com.bellinfo.exam.student.service.StudentService;
@Controller
public class StudentController {
	@Autowired
	Student student;
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value="/student-register", method=RequestMethod.GET)
	public String studentRegister(Model model){
		model.addAttribute("student",student);
		return "student-register";
	}
	@RequestMapping(value="/student-register", method=RequestMethod.POST)
	public String studentRegister(@Valid @ModelAttribute("student") Student student,BindingResult br, Model model){
		if(br.hasErrors())
		{
			return "student-register";
		}
		try {
			model.addAttribute("studentId",studentService.saveStudent(student));
			return "success-std";
		} catch (Exception e) {
			model.addAttribute("exceptionDetails","UserName or Email already exist");
			return "student-register";
		}
	}
	
}