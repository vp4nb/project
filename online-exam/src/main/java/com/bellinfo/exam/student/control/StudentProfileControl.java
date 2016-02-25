package com.bellinfo.exam.student.control;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bellinfo.exam.student.service.StudentService;
import com.bellinfo.exam.model.Student;
import com.bellinfo.exam.model.StudentSubject;

@Controller
public class StudentProfileControl {
	@Autowired
	StudentService studentService;
	@Autowired
	StudentSubject studentSubject;
	
	
	@RequestMapping(value="/student/{studentId}/profile", method=RequestMethod.GET)
	public String viewStudentProfile(Model model, @PathVariable Integer studentId){
		model.addAttribute("student",studentService.getStudent(studentId));
		model.addAttribute("subjectList", studentService.getSubject(studentId));
		return "student-profile";
	}
	
	@RequestMapping(value="/student/{studentId}/subject/add", method=RequestMethod.GET)
	public String addStudentSubject(Model model, @PathVariable Integer studentId){
		model.addAttribute("subject",studentSubject);
		model.addAttribute("student",studentService.getStudent(studentId));
		model.addAttribute("subjectList", studentService.getSubject(studentId));
		return "add-student-subject";
	}
	
	@RequestMapping(value="/student/{studentId}/subject/add", method=RequestMethod.POST)
	public String addStudentSubject(@Valid @ModelAttribute("subject") StudentSubject subject,
										BindingResult br, Model model,@PathVariable Integer studentId){
		if(br.hasErrors()){
			model.addAttribute("student",studentService.getStudent(studentId));
			model.addAttribute("subjectList", studentService.getSubject(studentId));
			return "add-student-subject";
		}
		try {
			studentService.saveSubject(subject);
			return viewStudentProfile(model, studentId);
		} catch (Exception e) {
			model.addAttribute("message", "subject already exist");
			model.addAttribute("student",studentService.getStudent(studentId));
			model.addAttribute("subjectList", studentService.getSubject(studentId));
			return "add-student-subject";
		}
	}
	
	@RequestMapping(value="/student/{studentId}/subject/{subjectId}", method=RequestMethod.GET)
	public String viewSubjectTests(Model model, @PathVariable Integer studentId, @PathVariable Integer subjectId){
		studentSubject = studentService.getSubjectBySubjectId(subjectId);
		model.addAttribute("student",studentService.getStudent(studentId));
		model.addAttribute("subject", studentSubject);
		model.addAttribute("testsList", studentService.getSubjectTests(studentSubject.getSubject()));
		return "student-subject-test";
	}
	
	
}
