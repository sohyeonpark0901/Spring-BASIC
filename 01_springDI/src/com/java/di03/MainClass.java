package com.java.di03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("appCTX.xml");
		
		Sub sub1 = (Sub) ctx.getBean("sub1");
		System.out.println(sub1.toString());
		
		Sub sub2 = (Sub) ctx.getBean("sub2");
		System.out.println(sub2.toString());
	}
}
