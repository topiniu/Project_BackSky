package com.pb.project_a;

import javax.persistence.*;

@Entity
@Table(name="tb_answers")
public class Answer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID;
	
	private String content;
	
	private int belongQuestionId;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getBelongQuestionId() {
		return belongQuestionId;
	}

	public void setBelongQuestionId(int belongQuestionId) {
		this.belongQuestionId = belongQuestionId;
	}

	public Answer(String content, int belongQuestionId) {
		super();
		this.content = content;
		this.belongQuestionId = belongQuestionId;
	}
	
	
	public Answer() {
		// TODO Auto-generated constructor stub
	}
}
