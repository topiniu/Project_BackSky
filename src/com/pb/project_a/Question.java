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
	
	private String[] answers;
	
	private String[] rightAnswers;
	
	private String managerId;
	
	public Question(String frontID, String content, String[] answers,
			String[] rightAnswers,String managerId) {
//		super();
		this.frontID = frontID;
		this.content = content;
		this.answers = answers;
		this.rightAnswers = rightAnswers;
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


	public String[] getAnswers() {
		return answers;
	}


	public void setAnswers(String[] answers) {
		this.answers = answers;
	}


	public String[] getRightAnswers() {
		return rightAnswers;
	}


	public void setRightAnswers(String[] rightAnswers) {
		this.rightAnswers = rightAnswers;
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
}
