package com.java.di07;

import org.springframework.beans.factory.annotation.Value;

public class PrintB implements Print{
	
	@Value("자동주입을 통한 출력")
	String printStr;
	
	public PrintB(String printStr) {
		
		this.printStr = printStr;
	}
	
	public PrintB() {}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("B print 결과 : " + printStr);
	}

}
