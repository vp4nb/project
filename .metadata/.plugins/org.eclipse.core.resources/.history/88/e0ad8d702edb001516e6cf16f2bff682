package com.bellinfo.exam.faculty.repository;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bellinfo.exam.model.ExamQuestion;
import com.bellinfo.exam.model.Faculty;

@Repository("examRepository")
@Transactional
public class ExamRepositoryImpl implements ExamRepository{

	@Autowired
	SessionFactory sessionFactory;
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public int saveQuestion(ExamQuestion examQuestion)
	{
		return (Integer) getSession().save(examQuestion); 
	}

}
