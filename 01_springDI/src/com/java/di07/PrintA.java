package com.java.di07;

import org.springframework.beans.factory.annotation.Value;

public class PrintA implements Print{

	@Value("자동주입을 통한 출력")
	String printStr;
	@Value("문자열 출력")
	String str;
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("A print 결과 : " + printStr+"문자열 출력:"+str);
	}
	
	public PrintA() {}
	
}
