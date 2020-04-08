package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoApplication {

	public static void main(String[] args) {
	//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.properties");

		//get the bean from spring container
		Coach theCoach = context.getBean("thatSillyCoach",Coach.class);

		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());

		//close the context
		context.close();
	}

}
