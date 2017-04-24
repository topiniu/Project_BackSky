package com.pb.project_a;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="tb_questiones")
public class Question {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID;
	
	private String frontID;
	
	private String content;
	
	
	private String managerId;
	
	public Question(String frontID, String content, String managerId) {
//		super();
		this.frontID = frontID;
		this.content = content;
		this.managerId = managerId;
	}


	public String getFrontID() {
		return frontID;
	}


	public void setFrontID(String frontID) {
		this.frontID = frontID;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}

	public Question() {
		// TODO Auto-generated constructor stub
	}


	public String getManagerId() {
		return managerId;
	}


	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	
	public void showSelf(){
		
	}
}
