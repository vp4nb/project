package com.bellinfo.exam.control;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bellinfo.exam.model.Login;
import com.bellinfo.exam.service.FacultyService;
import com.bellinfo.exam.service.StudentService;
@Controller
public class StudentLoginController {

	@Autowired
	Login login;
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value="/student-login", method=RequestMethod.GET)
	public String facultyLogin(Model model){
		model.addAttribute("login",login);
		return "student-login";
	}
	@RequestMapping(value="/student-login", method=RequestMethod.POST)
	public String facultyLogin(@Valid @ModelAttribute("login") Login login,BindingResult br, Model model){
		if(br.hasErrors())
		{
			return "student-login";
		}
		model.addAttribute("studentId",studentService.getStudent(login));
		return "success-std";
	}
	
	
}