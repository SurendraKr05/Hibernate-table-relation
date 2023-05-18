package com.suren.hibernate_table_relation.entityonetomany;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="answer_mo_info")
@SuppressWarnings("serial")
public class AnswerOM implements Serializable{
	@Id
	@Column(name ="answer_id")
	private long answerId;
	@Column(name ="answer")
	private String answer;
	
	@ManyToOne(cascade =CascadeType.ALL)
	private QuestionOM question;
	
	
	
	public long getAnswerId() {
		return answerId;
	}
	public void setAnswerId(long answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public QuestionOM getQuestion() {
		return question;
	}
	public void setQuestion(QuestionOM question) {
		this.question = question;
	}
	public AnswerOM(long answerId, String answer, QuestionOM question) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.question = question;
	}
	public AnswerOM() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AnswerOM [answerId=" + answerId + ", answer=" + answer + ", question=" + question + "]";
	}


	
}
