package com.bellinfo.exam.student.service;

import java.util.List;

import com.bellinfo.exam.model.ExamQuestion;
import com.bellinfo.exam.model.UserExamResults;
import com.bellinfo.exam.model.UserOption;

public interface ExamLoadingSerivice {

	public List<ExamQuestion> getQuestionsList(int testId);
	public ExamQuestion getQuestion(int testId);
	public void saveQuestion(UserOption userOption);
	public int getQuestionListSize();
	public int calculatedScore();
	public void saveExamResult(UserExamResults userExamResults);
}