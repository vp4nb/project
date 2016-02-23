package com.bellinfo.exam.faculty.repository;

import java.util.List;

import com.bellinfo.exam.model.Faculty;
import com.bellinfo.exam.model.FacultySubject;
import com.bellinfo.exam.model.FacultySubjectTests;
import com.bellinfo.exam.model.Login;

public interface FacultyRepository {
	public int saveFaculty(Faculty faculty);
	public Faculty getFaculty(Login login);
	public Faculty getFaculty(int facultyId);
	public List<FacultySubject> getSubject(int facultyId);
	public boolean saveSubject(FacultySubject subject) throws Exception;
	public FacultySubject getSubjectBySubjectId(int subjectId);
	public List<FacultySubjectTests> getSubjectTests(int subjectId);
	public boolean saveSubjectTests(FacultySubjectTests subjectTests) throws Exception;
}
