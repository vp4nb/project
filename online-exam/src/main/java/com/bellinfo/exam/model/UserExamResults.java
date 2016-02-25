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
@Table(name="USER_EXAM_RESULTS")
public class UserExamResults {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RESULT_ID")
	private int id;
	@Column(name="USER_ID")
	private int userId;
	@Column(name="TEST_ID")
	private int testId;
	@Column(name="SCORE")
	private int score;
	public UserExamResults() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserExamResults(int id, int userId, int testId, int score) {
		super();
		this.id = id;
		this.userId = userId;
		this.testId = testId;
		this.score = score;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + score;
		result = prime * result + testId;
		result = prime * result + userId;
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
		UserExamResults other = (UserExamResults) obj;
		if (id != other.id)
			return false;
		if (score != other.score)
			return false;
		if (testId != other.testId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserExamResults [id=" + id + ", userId=" + userId + ", testId=" + testId + ", score=" + score + "]";
	}
	
	
}
