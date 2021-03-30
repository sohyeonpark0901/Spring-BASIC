package com.java.di04;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.java.di03.Sub;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("appCTX.xml");
		
		CC cc = (CC) ctx.getBean("cc");
		cc.disp();
		ctx.close();
		
		
	}
}
