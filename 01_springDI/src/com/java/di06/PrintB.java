package com.java.di06;

public class PrintB implements Print{
	
	String printStr;
	
	public PrintB(String printStr) {
		
		this.printStr = printStr;
	}
	
	public PrintB() {}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("B print °á°ú : " + printStr);
	}

}
