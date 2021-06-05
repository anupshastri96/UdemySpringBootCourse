package com.anupcodes.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach cricket = context.getBean("cricketCoach", Coach.class);
		
		System.out.println(cricket.doExercise());
		
		System.out.println(cricket.getDailyFortune());
		
		context.close();

	}

}
