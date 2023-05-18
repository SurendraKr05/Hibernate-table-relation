package com.suren.hibernate_table_relation;

import java.util.ArrayList;
import java.util.List;

import com.suren.hibernate_table_relation.entitymanytomany.Emp;
import com.suren.hibernate_table_relation.entitymanytomany.Project;
import com.suren.hibernate_table_relation.repository.RepositoryManyToMany;

public class App 
{	
	public static void main(String[] args) {
		
		Emp emp1=new Emp();
		Emp emp2=new Emp();
		Emp emp3=new Emp();
		emp1.setEid(12);
		emp1.setName("Rohan");
		
		emp2.setEid(13);
		emp2.setName("Kaviya");

		emp3.setEid(105);
		emp3.setName("Rashmita");

		Project project1 = new Project();
		Project project2 = new Project();
		Project project3 = new Project();
		project1.setPid(301);
		project1.setProjectName("Octupus");
		
		project2.setPid(401);
		project2.setProjectName("Smiling Buddha");
		project3.setPid(143);
		project3.setProjectName("Alpha");
		
		
		
		List<Emp> list1 =new ArrayList<Emp>();
		List<Project> list2 =new ArrayList<Project>();
		
		list1.add(emp1);
		list1.add(emp2);
		list1.add(emp3);
		
		list2.add(project1);
		list2.add(project2);
		list2.add(project3);
		
		
		emp1.setProjects(list2);
		emp2.setProjects(list2);
		emp3.setProjects(list2);
		
		RepositoryManyToMany re=new RepositoryManyToMany();
		re.saveEmpDetails(emp1);
		re.saveEmpDetails(emp2);
		re.saveEmpDetails(emp3);
		re.saveProjectDetails(project1);
		re.saveProjectDetails(project2);
		re.saveProjectDetails(project3);
		
		
		
		
	}
	
	
	
	
	
	
/*	
	public static void main(String[] args) {
		QuestionOM qom = new QuestionOM();
		qom.setQuestionId(121);
		qom.setQuestion("What is java?");
		
		
		AnswerOM aom = new AnswerOM();	
		aom.setAnswerId(243);
		aom.setAnswer("Java is high level language");
		aom.setQuestion(qom);
		AnswerOM aom1 = new AnswerOM();	
		aom1.setAnswerId(245);
		aom1.setAnswer("Java is oop language");
		aom1.setQuestion(qom);
		
		AnswerOM aom2 = new AnswerOM();	
		aom2.setAnswerId(441);
		aom2.setAnswer("With the help of Java we create website");
		aom2.setQuestion(qom);
		
		List<AnswerOM> list=new ArrayList<AnswerOM>();
		list.add(aom);
		list.add(aom1);
		list.add(aom2);
		
		QuestionAnswerRepositoryOneToMany aqrom = new QuestionAnswerRepositoryOneToMany();
		aqrom.saveQuestionDetails(qom);
		aqrom.saveAnswerDetails(aom);
		aqrom.saveAnswerDetails(aom1);
		aqrom.saveAnswerDetails(aom2);
		
//		QuestionOM qst=(QuestionOM) aqrom.get(QuestionOM.class,121);
//		System.out.println(qst.getQuestion());
//		for(AnswerOM ans:qst.getAnswer())
//		{
//			System.out.println(ans.getAnswer());
//		}
		
	}
	*/
/*	public static void main( String[] args )
    {
    	Question question = new Question();
    	Answer answer = new Answer();
    	question.setQuestionId(101);
    	question.setQuestion("What is java ?");
    	answer.setAnswerId(1001);
    	answer.setAnswer("Java is an oop language");
    	answer.setQuestion(question);
    	question.setAnswer(answer);
    	QuestionAnswerRepository aqr = new QuestionAnswerRepository();
    	aqr.saveQuestionDetails(question);
    		
    	
    	Question question1 = new Question();
    	Answer answer1 = new Answer();
        question1.setQuestionId(102);
	    question1.setQuestion("What is Collection Framework ?");
	    answer1.setAnswerId(1002);
	    answer1.setAnswer("API to work with Group of Objects");
	    answer.setQuestion(question1);
	   	question1.setAnswer(answer1);      
	   	QuestionAnswerRepository aqr1 = new QuestionAnswerRepository();
	   	aqr1.saveQuestionDetails(question1);
    	 
	   
    	Question question3 = new Question();
    	Answer answer3 = new Answer();	
    	question3.setQuestionId(103);
    	answer3.setAnswer("Hibernate is a framework to connect database and java program");
    	answer3.setAnswerId(1003);
    	question3.setQuestion("What is Hibernate ?");    	
    	
    	answer3.setQuestion(question3);
    	question3.setAnswer(answer3);
        
    	QuestionAnswerRepository aqr3 = new QuestionAnswerRepository();
    	aqr3.saveQuestionDetails(question3);
    		
    }
    */
}
