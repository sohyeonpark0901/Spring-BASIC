package com.java.di01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		/**
		 * Ŭ�������� ���յ��� �������� �������� �������� �ڵ带 �����ؾ� �ϴ� ������ �о�����.
		 * Ŭ�������� ���յ��� ���ϰ�, �������� ���� �ۼ��ϱ� ���� DI��� ���� ������ ����ϴµ�
		 * DI�� ���� ��ü�� �ܺηκ��� ���� �޾Ƽ� ����
		 * */
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("appCTX.xml");
		
		Su su =(Su) ctx.getBean("su"); //getBean���� ������ ���� ���� ����ȯ�� �����ؾ� �Ѵ�.
		su.disp();
		ctx.close(); //xml����� ������ �ڿ������� ��������� �ʼ�!
		
	}
}
