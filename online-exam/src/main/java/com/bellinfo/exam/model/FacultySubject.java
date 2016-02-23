package com.bellinfo.exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Component("facultySubject")
@Entity
@Table(name="FACULTY_SUBJECT")
public class FacultySubject {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SUBJECT_ID")
	private int id;
	@Column(name="SUBJECT_NAME")
	@NotBlank
	private String subject;
	@Column(name="FACULTY_ID")
	private int facultyId;
	public FacultySubject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FacultySubject(int id, String subject, int facultyId) {
		super();
		this.id = id;
		this.subject = subject;
		this.facultyId = facultyId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + facultyId;
		result = prime * result + id;
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
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
		FacultySubject other = (FacultySubject) obj;
		if (facultyId != other.facultyId)
			return false;
		if (id != other.id)
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "FacultySubject [id=" + id + ", subject=" + subject + ", facultyId=" + facultyId + "]";
	}
	
}
