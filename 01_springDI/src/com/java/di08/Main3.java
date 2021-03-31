package com.java.di08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.java.di07.Excel2;

public class Main3 {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/java/di08/config.xml");
		Excel3 excel3 = ctx.getBean("excel",Excel3.class);
		excel3.excelPrint();
		
	

	}

}
