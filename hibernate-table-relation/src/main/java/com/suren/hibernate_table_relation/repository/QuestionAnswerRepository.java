package com.suren.hibernate_table_relation.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.suren.hibernate_table_relation.entity.Answer;
import com.suren.hibernate_table_relation.entity.Question;
import com.suren.hibernate_table_relation.util.SessionFactoryUtil;


public class QuestionAnswerRepository {
	public void saveAnswerDetails(Answer answer)
    {
    	SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.beginTransaction();
    	session.merge(answer);
    	transaction.commit();
    
    }
	public void saveQuestionDetails(Question question)
    {
    	SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.beginTransaction();
    	session.merge(question);
    	transaction.commit();
    
    }
	
}
