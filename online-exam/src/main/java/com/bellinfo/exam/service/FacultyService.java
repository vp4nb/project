package com.bellinfo.exam.service;

import com.bellinfo.exam.model.Faculty;
import com.bellinfo.exam.model.Login;

public interface FacultyService {

	public int saveFaculty(Faculty faculty);
	public Faculty getFaculty(Login login);
}