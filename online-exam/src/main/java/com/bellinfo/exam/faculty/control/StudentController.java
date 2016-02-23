package com.bellinfo.exam.faculty.control;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bellinfo.exam.faculty.service.StudentService;
import com.bellinfo.exam.faculty.service.StudentServiceImpl;
import com.bellinfo.exam.model.Student;
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
		model.addAttribute("studentId",studentService.saveStudent(student));
		return "success-std";
	}
	
}
