package com.cg.jpa.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import co.cg.jpa.entity.Student;

public class Clientclass {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=emf.createEntityManager();
		/*
		em.getTransaction().begin();
		Student s1=new Student();
		s1.setName("Amit");
	    s1.setEmailid("amit@gmail.com");
	    em.persist(s1);
	    em.flush();
	    System.out.println("Record added :"+s1.getRollno());
	    em.getTransaction().commit();
	    Student s2=em.find(Student.class,2);
	    System.out.println(s2.getEmailid());
	    System.out.println(s2.getRollno());
	    System.out.println(s2.getName());
	    	    
		//updating record
    Student s3=new Student();
    s3.setEmailid("Amit123@gmail.com");
    s3.setName("Amit");
    s3.setRollno(1);
    em.getTransaction().begin();
    em.merge(s3);
    System.out.println("Row updated.......");
    em.getTransaction().commit();
    */
		//deleting record
		Student s4=em.find(Student.class,2);
		em.getTransaction().begin();
		em.remove(s4);
		System.out.println("Record deleted...");
		em.getTransaction().commit();
	}

}
