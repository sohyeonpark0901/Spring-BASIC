package com.java.di06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.java.di07.Excel2;

public class Main {

	public static void main(String[] args) {
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/java/di07/config2.xml");
		Excel2 excel = ctx.getBean("excel",Excel2.class);
		excel.excelPrint();
		

	}

}
