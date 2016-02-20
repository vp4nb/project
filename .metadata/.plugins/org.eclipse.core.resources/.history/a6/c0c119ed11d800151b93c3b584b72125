package com.bellinfo.faculty.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
@Table(name="FACULTY_REG")
@Component
public class FacultyLogin {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Faculty_Id")
	private int id;
	
	@NotEmpty
	@Size(min=2, max=10)
	@Column(name="Faculty_name")
	private String userName;
	
	
	@NotBlank
	@Column(name="Faculty_Password")
	private String passWord;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "FacultyLogin [id=" + id + "userName=" + userName + ", passWord=" + passWord + "]";
	}
	
	
	
}
