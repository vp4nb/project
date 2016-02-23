package com.bellinfo.exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Component("facultySubjectTests")
@Entity
@Table(name="FACULTY_SUBJECT_TESTS")
public class FacultySubjectTests {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TEST_ID")
	private int id;
	@Column(name="TEST_NAME")
	@NotBlank
	private String test;
	@Column(name="SUBJECT_ID")
	private int subjectId;
	public FacultySubjectTests() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FacultySubjectTests(int id, String test, int subjectId) {
		super();
		this.id = id;
		this.test = test;
		this.subjectId = subjectId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + subjectId;
		result = prime * result + ((test == null) ? 0 : test.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FacultySubjectTests other = (FacultySubjectTests) obj;
		if (id != other.id)
			return false;
		if (subjectId != other.subjectId)
			return false;
		if (test == null) {
			if (other.test != null)
				return false;
		} else if (!test.equals(other.test))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "FacultySubjectTests [id=" + id + ", test=" + test + ", subjectId=" + subjectId + "]";
	}
	
	
}
