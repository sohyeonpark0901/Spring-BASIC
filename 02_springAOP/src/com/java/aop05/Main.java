package com.java.aop05;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = 
		new GenericXmlApplicationContext("classpath:com/java/aop05/config.xml");
		
		AopTest aopTest = ctx.getBean(AopTest.class);
		aopTest.method1();
		aopTest.method2();
		aopTest.method3();
		aopTest.method4();
		
	}
}
