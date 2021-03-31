package com.java.di09.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifeCycle2 {
	
	@PostConstruct
	public void initMethod() {
		System.out.println("后 檬扁拳 角青");
		
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("后 家戈 角青");
		
	}
}
