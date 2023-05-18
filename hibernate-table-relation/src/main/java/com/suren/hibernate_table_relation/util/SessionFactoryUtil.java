package com.suren.hibernate_table_relation.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.suren.hibernate_table_relation.entity.Answer;
import com.suren.hibernate_table_relation.entity.Question;
import com.suren.hibernate_table_relation.entitymanytomany.Emp;
import com.suren.hibernate_table_relation.entitymanytomany.Project;
import com.suren.hibernate_table_relation.entityonetomany.AnswerOM;
import com.suren.hibernate_table_relation.entityonetomany.QuestionOM;

public class SessionFactoryUtil {
private static SessionFactory sessionFactory=null;
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory == null)
		{
			Configuration cfg=new Configuration();
			cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
//			cfg.addAnnotatedClass(Answer.class);
//			cfg.addAnnotatedClass(QuestionOM.class);
//			cfg.addAnnotatedClass(AnswerOM.class);
			cfg.addAnnotatedClass(Emp.class);
			cfg.addAnnotatedClass(Project.class);
			
			sessionFactory = cfg.buildSessionFactory();	
		}
		return sessionFactory;
		
	}
}
