package com.bellinfo.exam.repository;

import com.bellinfo.exam.model.Login;
import com.bellinfo.exam.model.Student;

public interface StudentRepository {
	public int saveStudent(Student student);
	public Student getStudent(Login login);
}