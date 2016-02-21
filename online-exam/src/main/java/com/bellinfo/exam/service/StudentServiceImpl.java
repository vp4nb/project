package com.bellinfo.exam.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bellinfo.exam.model.Login;
import com.bellinfo.exam.model.Student;
import com.bellinfo.exam.repository.StudentRepository;
import com.bellinfo.exam.repository.StudentRepositoryImpl;

@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepository srepo;
	public int saveStudent(Student student) {
		return srepo.saveStudent(student);
	}
	public Student getStudent(Login login)
	{
		return srepo.getStudent(login);
	}

	
}