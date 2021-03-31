package com.java.di08;

import org.springframework.stereotype.Component;

@Component("print-B")
public class PrintB implements Print{
	
	public PrintB() {}
	@Override
	public void print() {
		
		System.out.println("printerB ");
	}

}
