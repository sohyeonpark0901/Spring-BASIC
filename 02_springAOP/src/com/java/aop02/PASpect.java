package com.java.aop02;

import org.aspectj.lang.JoinPoint;

public class PASpect {
	//���� Ŭ���� : aspect
	
	public void awake(JoinPoint joinPoint) { // �����Լ� : advice
		System.out.println("�Ͼ��");		 // JOINPOINT: �ٽ��ڵ带 �����´�.
		
	}
	
	public void sleep(JoinPoint joinPoint) { // �����Լ� : advice
											 // JOINPOINT: �ٽ��ڵ带 �����´�.
		System.out.println("�����ܴ�");
	}
}
