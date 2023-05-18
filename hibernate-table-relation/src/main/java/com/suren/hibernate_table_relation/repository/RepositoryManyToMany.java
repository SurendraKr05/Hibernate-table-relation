package com.suren.hibernate_table_relation.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.suren.hibernate_table_relation.entitymanytomany.Emp;
import com.suren.hibernate_table_relation.entitymanytomany.Project;
import com.suren.hibernate_table_relation.util.SessionFactoryUtil;

public class RepositoryManyToMany {
	public void saveEmpDetails(Emp emp)
    {
    	SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.beginTransaction();
    	session.merge(emp);
    	transaction.commit();
    
    }
	public void saveProjectDetails(Project project)
    {
    	SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.beginTransaction();
    	session.merge(project);
    	transaction.commit();
    
    }
}
