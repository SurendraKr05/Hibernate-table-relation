package com.suren.hibernate_table_relation.entityonetomany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="question_om_info")
@SuppressWarnings("serial")
public class QuestionOM implements Serializable{
	@Id
	@Column(name ="question_id")
	private long questionId;
	@Column(name ="question")
	private String question;
	
	@OneToMany(mappedBy= "question")
	private List<AnswerOM> answer;

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<AnswerOM> getAnswer() {
		return answer;
	}

	public void setAnswer(List<AnswerOM> answer) {
		this.answer = answer;
	}

	public QuestionOM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuestionOM(long questionId, String question, List<AnswerOM> answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "QuestionOM [questionId=" + questionId + ", question=" + question + ", answer=" + answer + "]";
	}
	

	
}
