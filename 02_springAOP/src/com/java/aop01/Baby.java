package com.java.aop01;

public class Baby implements Person{

	@Override
	public void awake() {
		System.out.println("�Ͼ��");
		
	}

	@Override
	public void work() {
		System.out.println("�ֱ� ���Ѵ�");
		
	}

	@Override
	public void sleep() {
		System.out.println("�����ܴ�");
	}

}
