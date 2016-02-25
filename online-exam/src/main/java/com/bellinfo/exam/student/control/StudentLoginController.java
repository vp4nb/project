package com.bellinfo.exam.student.control;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bellinfo.exam.model.Login;
import com.bellinfo.exam.model.Student;
@Controller
public class StudentLoginController {

	@Autowired
	Login login;
	@Autowired
	com.bellinfo.exam.student.service.StudentService studentService;
	@Autowired
	Student student;
	
	@RequestMapping(value="/student-login", method=RequestMethod.GET)
	public String studentLogin(Model model){
		model.addAttribute("login",login);
		return "student-login";
	}
	@RequestMapping(value="/student-login", method=RequestMethod.POST)
	public String studentLogin(@Valid @ModelAttribute("login") Login login,BindingResult br, Model model){
		if(br.hasErrors())
		{
			return "student-login";
		}
		if((student=studentService.getStudent(login))!=null){
			model.addAttribute("student",student);
			model.addAttribute("studentId", student.getId());
			return "student-home";
		}
		else{
		model.addAttribute("exceptionDetails", "username and password are not matching!!!");
		return "student-login";
		}
	}
	@RequestMapping(value="/student/{studentId}/home", method=RequestMethod.GET)
	public String studentHome(Model model){
		model.addAttribute("student",student);
		model.addAttribute("studentId", student.getId());
		return "student-home";
	}
	
	
}
