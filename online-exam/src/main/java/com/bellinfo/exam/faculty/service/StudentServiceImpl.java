package com.bellinfo.exam.faculty.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bellinfo.exam.faculty.repository.StudentRepository;
import com.bellinfo.exam.faculty.repository.StudentRepositoryImpl;
import com.bellinfo.exam.model.Login;
import com.bellinfo.exam.model.Student;

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