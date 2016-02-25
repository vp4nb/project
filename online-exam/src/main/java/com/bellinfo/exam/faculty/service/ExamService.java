package com.bellinfo.exam.faculty.service;

import java.util.List;

import com.bellinfo.exam.model.ExamQuestion;

public interface ExamService {
	
	public int saveQuestion(ExamQuestion examQuestion) throws Exception;
}
