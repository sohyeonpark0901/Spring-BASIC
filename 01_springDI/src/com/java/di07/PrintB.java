package com.java.di07;

import org.springframework.beans.factory.annotation.Value;

public class PrintB implements Print{
	
	@Value("�ڵ������� ���� ���")
	String printStr;
	
	public PrintB(String printStr) {
		
		this.printStr = printStr;
	}
	
	public PrintB() {}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("B print ��� : " + printStr);
	}

}
