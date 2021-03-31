package com.java.di09.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifeCycle2 {
	
	@PostConstruct
	public void initMethod() {
		System.out.println("�� �ʱ�ȭ ����");
		
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("�� �Ҹ� ����");
		
	}
}
