package com.pb.project_a;

import javax.persistence.*;

@Entity
@Table(name="tb_questiones")
public class Question {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID;
	
	private String frontID;
	
	private String content;

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

	public Question(String frontID, String content) {
		super();
		this.frontID = frontID;
		this.content = content;
	}
	
	public Question() {
		// TODO Auto-generated constructor stub
	}
}
