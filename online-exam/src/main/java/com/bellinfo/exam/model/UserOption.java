package com.bellinfo.exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="USER_EXAM_OPTION")
public class UserOption {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="OPTION_ID")
	private int id;
	@Column(name="STUDENT_ID")
	private int studentId;
	@Column(name="USER_OPTION")
	private String userOption;
	@Column(name="QUESTION_ID")
	private int questionId;
	public UserOption() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserOption(int id, int studentId, String userOption, int questionId) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.userOption = userOption;
		this.questionId = questionId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getUserOption() {
		return userOption;
	}
	public void setUserOption(String userOption) {
		this.userOption = userOption;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + questionId;
		result = prime * result + studentId;
		result = prime * result + ((userOption == null) ? 0 : userOption.hashCode());
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
		UserOption other = (UserOption) obj;
		if (id != other.id)
			return false;
		if (questionId != other.questionId)
			return false;
		if (studentId != other.studentId)
			return false;
		if (userOption == null) {
			if (other.userOption != null)
				return false;
		} else if (!userOption.equals(other.userOption))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserOption [id=" + id + ", studentId=" + studentId + ", userOption=" + userOption + ", questionId="
				+ questionId + "]";
	}
	
}
