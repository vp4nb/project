package com.bellinfo.exam.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bellinfo.exam.model.ExamQuestion;
import com.bellinfo.exam.model.UserExamResults;
import com.bellinfo.exam.model.UserOption;
import com.bellinfo.exam.student.repository.ExamLoadingRepository;

@Service("examLoadingService")
@Transactional
public class ExamLoadingServiceImpl implements ExamLoadingSerivice{

	@Autowired
	ExamLoadingRepository examLoadingRepository;
	List<ExamQuestion> list;
	List<UserOption> userList;
	public List<ExamQuestion> getQuestionsList(int testId){
		list= examLoadingRepository.getQuestionsList(testId);
		userList =new ArrayList<UserOption>();
		return list;
	}
	public ExamQuestion getQuestion(int testId) {
		return list.get(0);
	}
	public void saveQuestion(UserOption userOption) {
		userList.add(userOption);
		list.remove(0);
	}
	public int getQuestionListSize() {
		return list.size();
	}
	public int calculatedScore() {
		int score=0;
		for(UserOption userOption:userList){
			if(userOption.getUserOption().equals(examLoadingRepository.getAnswer(userOption.getQuestionId()))){
				score++;
			}
		}
		
		return score;
	}
	public void saveExamResult(UserExamResults userExamResults) {
		examLoadingRepository.saveExamResult(userList, userExamResults);
		
	}
}
