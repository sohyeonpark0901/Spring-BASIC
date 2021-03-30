package com.java.di05;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("appCTX.xml");
		Message en = (Message) ctx.getBean("messageEn");
		en.sayHello("spring");
		
		Message kr = (Message) ctx.getBean("messageKr");
		kr.sayHello("��");
	}
	
}
