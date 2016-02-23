package com.bellinfo.exam.faculty.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.loader.custom.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bellinfo.exam.faculty.repository.ExamRepository;
import com.bellinfo.exam.model.ExamQuestion;

@Service("examService")
@Transactional
public class ExamServiceImpl implements ExamService{

	@Autowired
	ExamRepository  examRepository;
		
	public int saveQuestion(ExamQuestion examQuestion) {
		return examRepository.saveQuestion(examQuestion);
	}
	
}
