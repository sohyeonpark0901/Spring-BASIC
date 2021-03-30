package com.java.aop02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/java/aop02/appCTX.xml");
		
		Person papa = (Person) ctx.getBean("papa");
		
		papa.work();
		
		
		Person mom = (Person) ctx.getBean("mom");
		
		mom.work();
		
		
		Person baby = (Person) ctx.getBean("baby");
		
		baby.work();
		
		
		ctx.close();
	}
}
