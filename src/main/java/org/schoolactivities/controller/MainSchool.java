package org.schoolactivities.controller;

import org.schoolactivities.model.*;
import org.schoolactivities.service.SchoolService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSchool {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beanfactory.xml");
		
		BasketballActivity beanBba = (BasketballActivity)context.getBean("basketballActivity");
		
		FootballActivity beanFba = (FootballActivity)context.getBean("footballActivity");
		
		System.out.println("Basketball Activity:");
		System.out.println(beanBba.getStudentA().getName() + " " + beanBba.getStudentA().getSurname());
		System.out.println(beanBba.getStudentB().getName() + " " + beanBba.getStudentB().getSurname());
		System.out.println(beanBba.getStudentC().getName() + " " + beanBba.getStudentC().getSurname());
		
		System.out.println("Football Activity:");
		System.out.println(beanFba.getStudentC().getName() + " " + beanFba.getStudentC().getSurname());
		System.out.println(beanFba.getStudentD().getName() + " " + beanFba.getStudentD().getSurname());
		System.out.println(beanFba.getStudentE().getName() + " " + beanFba.getStudentE().getSurname());
		
		/*using bean autowire byName*/
		beanFba.setStudentF(new Student());
		System.out.println(beanFba.getStudentF().getName() + " " + beanFba.getStudentF().getSurname());
		
		/*using bean autowire byName*/
		SchoolService beanSsrv = context.getBean("schoolService", SchoolService.class);
		System.out.println("\nSchool Service:");
		System.out.println("Basketball members.");
		System.out.println(beanSsrv.getBasketballActivity().getStudentA().getName());
		System.out.println(beanSsrv.getBasketballActivity().getStudentB().getName());
		System.out.println(beanSsrv.getBasketballActivity().getStudentC().getName());
		System.out.println("Football members.");
		System.out.println(beanSsrv.getFootballActivity().getStudentC().getName());
		System.out.println(beanSsrv.getFootballActivity().getStudentD().getName());
		System.out.println(beanSsrv.getFootballActivity().getStudentE().getName());
		System.out.println(beanSsrv.getFootballActivity().getStudentF().getName());
		
		/*close the ApplicationContext*/
		/*since ApplicationContext doesnt have close method, we cast it into 
		 * ClassPathXmlApplicationContext which has close method*/
		((ClassPathXmlApplicationContext)context).close();
		
		/*normal java object instances*/
		/*BasketballActivity bba = new BasketballActivity();
		bba.setStudentA(new Student());
		bba.setStudentB(new Student());
		bba.setStudentC(new Student());
		
		System.out.println("Basketball Activity:");
		System.out.println(bba.getStudentA().getName() + " " + bba.getStudentA().getSurname());
		System.out.println(bba.getStudentB().getName() + " " + bba.getStudentB().getSurname());
		System.out.println(bba.getStudentC().getName() + " " + bba.getStudentC().getSurname());
		
		FootballActivity fba = new FootballActivity();
		fba.setStudentC(bba.getStudentC());
		fba.setStudentD(new Student());
		fba.setStudentE(new Student());
		
		System.out.println("\nFootball Activity:");
		System.out.println(fba.getStudentC().getName() + " " + fba.getStudentC().getSurname());
		System.out.println(fba.getStudentD().getName() + " " + fba.getStudentD().getSurname());
		System.out.println(fba.getStudentE().getName() + " " + fba.getStudentE().getSurname());
		*/
		
	}

}
