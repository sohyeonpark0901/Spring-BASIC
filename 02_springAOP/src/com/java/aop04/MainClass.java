package com.java.aop04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/java/aop04/appCTX.xml");
		
		
		Person stu =(Person) ctx.getBean("student");
		stu.work();
		Person tea =(Person) ctx.getBean("teacher");
		tea.work();
		ctx.close();
	}
}
