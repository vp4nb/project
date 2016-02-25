package com.bellinfo.exam.student.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bellinfo.exam.model.FacultySubjectTests;
import com.bellinfo.exam.model.Login;
import com.bellinfo.exam.model.Student;
import com.bellinfo.exam.model.StudentSubject;
import com.bellinfo.exam.student.repository.StudentRepository;

@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepository srepo;

	public int saveStudent(Student student) throws Exception {
		return srepo.saveStudent(student);
	}

	public Student getStudent(Login login) {
		return srepo.getStudent(login);
	}

	public Student getStudent(int studentId) {
		return srepo.getStudent(studentId);
	}

	public List<StudentSubject> getSubject(int studentId) {
		return srepo.getSubject(studentId);
	}

	public boolean saveSubject(StudentSubject subject) throws Exception {
		return srepo.saveSubject(subject);
	}

	public StudentSubject getSubjectBySubjectId(int subjectId) {
		return srepo.getSubjectBySubjectId(subjectId);
	}

	public List<FacultySubjectTests> getSubjectTests(String subject) {
		return srepo.getSubjectTests(subject);
	}

	
	
}
