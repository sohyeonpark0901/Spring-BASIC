package com.java.di07;

import org.springframework.beans.factory.annotation.Value;

public class PrintA implements Print{

	@Value("�ڵ������� ���� ���")
	String printStr;
	@Value("���ڿ� ���")
	String str;
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("A print ��� : " + printStr+"���ڿ� ���:"+str);
	}
	
	public PrintA() {}
	
}
