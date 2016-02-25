package com.bellinfo.exam.faculty.repository;

import java.util.List;

import com.bellinfo.exam.model.ExamQuestion;

public interface ExamRepository {

	public int saveQuestion(ExamQuestion examQuestion) throws Exception;
}
