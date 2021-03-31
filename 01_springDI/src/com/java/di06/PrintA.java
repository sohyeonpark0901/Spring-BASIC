package com.java.di06;

public class PrintA implements Print{

	String printStr;
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("A print °á°ú : " + printStr);
	}
	
	public PrintA() {}
	
	public PrintA(String printStr) {
		super();
		this.printStr = printStr;
	}

	public void setPrintStr(String printStr) {
		this.printStr = printStr;
	}
	
}
