package com.suren.hibernate_table_relation.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.suren.hibernate_table_relation.entityonetomany.AnswerOM;
import com.suren.hibernate_table_relation.entityonetomany.QuestionOM;
import com.suren.hibernate_table_relation.util.SessionFactoryUtil;

public class QuestionAnswerRepositoryOneToMany {
	public void saveAnswerDetails(AnswerOM answerom)
    {
    	SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.beginTransaction();
    	session.merge(answerom);
    	transaction.commit();
    
    }
	public void saveQuestionDetails(QuestionOM questionom)
    {
    	SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.beginTransaction();
    	session.merge(questionom);
    	transaction.commit();
    
    }
}
