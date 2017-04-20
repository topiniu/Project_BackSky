package com.pb.project_a;

import javax.persistence.*;

@Entity
@Table(name="tb_rightAnswers")
public class RightAnswer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID;
	
	private String content;
	
	private String belongQuestionId;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getBelongQuestionId() {
		return belongQuestionId;
	}

	public void setBelongQuestionId(String belongQuestionId) {
		this.belongQuestionId = belongQuestionId;
	}

	public RightAnswer(String content, String belongQuestionId) {
		super();
		this.content = content;
		this.belongQuestionId = belongQuestionId;
	}
	
	public RightAnswer() {
		// TODO Auto-generated constructor stub
	}
}
