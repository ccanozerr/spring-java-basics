package com.canozer.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		Coach myGolfCoach = context.getBean("myGolfCoach", Coach.class);
		
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("GolfCoach " + myGolfCoach.getDailyWorkout());
		System.out.println("GolfCoach " + myGolfCoach.getDailyFortune());
		
		// call our new methods to get the literal values
		System.out.println(theCoach.getEmailAdress());
		
		System.out.println(theCoach.getTeam());
		
		// close the context
		context.close();

	}

}
