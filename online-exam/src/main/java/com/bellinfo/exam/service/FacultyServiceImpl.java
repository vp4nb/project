package com.bellinfo.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bellinfo.exam.model.FacultyLogin;
import com.bellinfo.exam.repository.FacultyRepository;

@Service
@Transactional
public class FacultyServiceImpl {
	
	@Autowired
	FacultyRepository frepo;

	public int saveFaculty(FacultyLogin flogin)
	{
		return frepo.saveFaculty(flogin);
	}
	public List<FacultyLogin> getFaculty()
	{
		return frepo.getFaculty();
	}
	public FacultyLogin getFaculty(int id)
	{
		return frepo.getFaculty(id);
	}
	public void updateFaculty(FacultyLogin flogin)
	{
		frepo.updateFaculty(flogin);
	}
	public void deleteFaculty(int id)
	{
		frepo.deleteFaculty(id);
	}
}
