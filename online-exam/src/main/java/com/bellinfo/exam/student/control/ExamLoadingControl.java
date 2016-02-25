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

import com.bellinfo.exam.model.ExamQuestion;
import com.bellinfo.exam.model.StudentSubject;
import com.bellinfo.exam.model.UserExamResults;
import com.bellinfo.exam.model.UserOption;
import com.bellinfo.exam.model.StudentSubject;
import com.bellinfo.exam.student.service.ExamLoadingSerivice;
import com.bellinfo.exam.student.service.StudentService;
@Controller
public class ExamLoadingControl {

	@Autowired
	ExamQuestion examQue;
	@Autowired
	StudentService studentService;
	@Autowired
	StudentSubject studentSubject;
	@Autowired
	ExamLoadingSerivice examLoadingService;
	@Autowired
	UserOption userOpt;
	@Autowired
	UserExamResults userExamResults;
	
	@RequestMapping(value="/write-exam/student/{studentId}", method=RequestMethod.GET)
	public String postExam(Model model, @PathVariable Integer studentId){
		model.addAttribute("subjectList", studentService.getSubject(studentId));
		return "write-exam";
	}
	
	@RequestMapping(value="/post-exam/student/{studentId}/subject/add", method=RequestMethod.GET)
	public String addExamSubject(Model model, @PathVariable Integer studentId){
		model.addAttribute("subjectList", studentService.getSubject(studentId));
		model.addAttribute("subject", studentSubject);
		return "add-exam-subject";
	}
	
	@RequestMapping(value="/post-exam/student/{studentId}/subject/add", method=RequestMethod.POST)
	public String addExamSubject(@Valid @ModelAttribute("subject") StudentSubject subject,BindingResult br,Model model, @PathVariable Integer studentId){
		if(br.hasErrors()){
			model.addAttribute("subjectList", studentService.getSubject(studentId));
			return "add-exam-subject";
		}
		try {
			studentService.saveSubject(subject);
			return postExam(model, studentId);
		} catch (Exception e) {
			model.addAttribute("message","subject already exist");
			model.addAttribute("subjectList", studentService.getSubject(studentId));
			return "add-exam-subject";
		}
	}
	
	@RequestMapping(value="/post-exam/student/{studentId}/subject/{subjectId}", method=RequestMethod.GET)
	public String examSubjectTests(Model model, @PathVariable Integer studentId, @PathVariable Integer subjectId){
		studentSubject = studentService.getSubjectBySubjectId(subjectId);
		model.addAttribute("subject", studentSubject);
		model.addAttribute("testList", studentService.getSubjectTests(studentSubject.getSubject()));
		return "exam-subject-test";
	}
	
	
	
	@RequestMapping(value="/write-exam/student/{studentId}/subject/{subjectId}/test/{testNumber}/write", method=RequestMethod.GET)
	public String addQuery(Model model,@PathVariable Integer studentId, @PathVariable Integer subjectId, @PathVariable Integer testNumber){
		examLoadingService.getQuestionsList(testNumber);
		model.addAttribute("question", examLoadingService.getQuestion(testNumber));
		model.addAttribute("userOption", userOpt);
		if(examLoadingService.getQuestionListSize()==1){
			model.addAttribute("type", "submit");
		}
		else if(examLoadingService.getQuestionListSize()>1){
			model.addAttribute("type", "next");
		}
		return "query-display";
	}
	
	@RequestMapping(value="/write-exam/student/{studentId}/subject/{subjectId}/test/{testNumber}/write", method=RequestMethod.POST)
	public String addQuery(@Valid @ModelAttribute("userOption") UserOption userOption,BindingResult br,Model model,@PathVariable Integer studentId, @PathVariable Integer subjectId, @PathVariable Integer testNumber){
		if(br.hasErrors()){
			return "query-display";
		}
		userOption.setQuestionId(examLoadingService.getQuestion(testNumber).getQuestionId());
		examLoadingService.saveQuestion(userOption);
		
		if(examLoadingService.getQuestionListSize()==1){
			model.addAttribute("type", "submit");
			model.addAttribute("question", examLoadingService.getQuestion(testNumber));
			model.addAttribute("userOption", userOpt);
		}
		else if(examLoadingService.getQuestionListSize()>1){
			model.addAttribute("type", "next");
			model.addAttribute("question", examLoadingService.getQuestion(testNumber));
			model.addAttribute("userOption", userOpt);
			
		}
		else{
			int score=examLoadingService.calculatedScore();
			userExamResults.setScore(score);
			userExamResults.setTestId(testNumber);
			userExamResults.setUserId(studentId);
			examLoadingService.saveExamResult(userExamResults);
			model.addAttribute("score",score);
			return "score-display";
		}
		return "query-display";
	}
}
