package com.bellinfo.exam.faculty.control;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bellinfo.exam.faculty.service.FacultyService;
import com.bellinfo.exam.faculty.service.FacultyServiceImpl;
import com.bellinfo.exam.model.Faculty;

@Controller
public class FacultyController {

	@Autowired
	Faculty faculty;
	@Autowired
	FacultyService facultyService;
	
	@RequestMapping(value="/faculty-register", method=RequestMethod.GET)
	public String facultyRegister(Model model){
		model.addAttribute("faculty",faculty);
		return "faculty-register";
	}
	@RequestMapping(value="/faculty-register", method=RequestMethod.POST)
	public String facultyRegister(@Valid @ModelAttribute("faculty") Faculty faculty,BindingResult br, Model model){
		if(br.hasErrors())
		{
			return "faculty-register";
		}
		try {
			model.addAttribute("facultyId",facultyService.saveFaculty(faculty));
			return "success";
		} catch (Exception e) {
			model.addAttribute("exceptionDetails","UserName or Email already exist");
			return "faculty-register";
		}
		
	}
	
	
	
}
