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
	
	private List<String> answers;
	
	private List<String> rightAnswers;
	
	
	public Question(String frontID, String content, List<String> answers,
			List<String> rightAnswers) {
		super();
		this.frontID = frontID;
		this.content = content;
		this.answers = answers;
		this.rightAnswers = rightAnswers;
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


	public List<String> getAnswers() {
		return answers;
	}


	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}


	public List<String> getRightAnswers() {
		return rightAnswers;
	}


	public void setRightAnswers(List<String> rightAnswers) {
		this.rightAnswers = rightAnswers;
	}


	public Question() {
		// TODO Auto-generated constructor stub
	}
}