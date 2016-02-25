package com.bellinfo.exam.faculty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bellinfo.exam.faculty.repository.FacultyRepository;
import com.bellinfo.exam.faculty.repository.FacultyRepositoryImpl;
import com.bellinfo.exam.model.Faculty;
import com.bellinfo.exam.model.FacultySubject;
import com.bellinfo.exam.model.FacultySubjectTests;
import com.bellinfo.exam.model.Login;

@Service("facultyService")
@Transactional
public class FacultyServiceImpl implements FacultyService{
	
	@Autowired
	FacultyRepository frepo;

	public int saveFaculty(Faculty faculty) throws Exception
	{
		return frepo.saveFaculty(faculty);
	}
	public Faculty getFaculty(Login login)
	{
		return frepo.getFaculty(login);
	}
	public Faculty getFaculty(int facultyId)
	{
		return frepo.getFaculty(facultyId);
	}
	public List<FacultySubject> getSubject(int facultyId)
	{
		return frepo.getSubject(facultyId);
	}
	
	public boolean saveSubject(FacultySubject subject) throws Exception {
		return frepo.saveSubject(subject);
	}
	
	public FacultySubject getSubjectBySubjectId(int subjectId){
		return frepo.getSubjectBySubjectId(subjectId);
	}
	public List<FacultySubjectTests> getSubjectTests(int subjectId) {
		return frepo.getSubjectTests(subjectId);
	}
	public boolean saveSubjectTests(FacultySubjectTests subjectTests) throws Exception {
		return frepo.saveSubjectTests(subjectTests);
	}
}
