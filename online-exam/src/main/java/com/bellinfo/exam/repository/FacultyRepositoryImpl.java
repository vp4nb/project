package com.bellinfo.exam.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bellinfo.exam.model.Faculty;
import com.bellinfo.exam.model.Login;

@Repository("frepo")
@Transactional
public class FacultyRepositoryImpl implements FacultyRepository{

	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	Faculty faculty;
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	public int saveFaculty(Faculty faculty)
	{
		return (Integer) getSession().save(faculty);
	}
	public Faculty getFaculty(Login login)
	{
		Criteria cr=getSession().createCriteria(Faculty.class);
		Criterion crt_userName=Restrictions.ilike("userName", login.getUserName());
		Criterion crt_passWord=Restrictions.ilike("passWord", login.getPassWord());
		cr.add(crt_userName);
		cr.add(crt_passWord);
		return (Faculty) cr.uniqueResult();
	}
	/*public void updateFaculty(FacultyLogin flogin)
	{
		//getSession().beginTransaction();
		getSession().saveOrUpdate(flogin);
		//getSession().getTransaction().commit();
	}
	public void deleteFaculty(int id)
	{
		//getSession().beginTransaction();
		Query q=getSession().createQuery("delete from FacultyLogin where id=:id");
		q.setInteger("id", id);
		q.executeUpdate();
		//getSession().getTransaction().commit();
	}*/
}