package com.java.di09.lifecycle;

import org.springframework.context.support.GenericXmlApplicationContext;

public class LifeCycleMain {
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:com/java/di09/lifecycle/config4.xml");
		System.out.println("load ����");
		
		ctx.refresh();
		System.out.println("refresh ����");
		
		BeanLifeCycle3 bean = ctx.getBean("bean",BeanLifeCycle3.class);
		System.out.println("getBean ����");

		ctx.close();
	}
}
