package com.java.di08;

import org.springframework.stereotype.Component;

@Component("print-A")
public class PrintA implements Print{
	
	public PrintA() {}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printer A" );
	}
	
	
	
	
	
}
