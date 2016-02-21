package com.bellinfo.exam.service;

import com.bellinfo.exam.model.Login;
import com.bellinfo.exam.model.Student;

public interface StudentService {

	public int saveStudent(Student student);
	public Student getStudent(Login login);
}
