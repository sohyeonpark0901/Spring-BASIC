package com.java.di06;

import java.util.List;

public class Excel {
	Print print;
	List<Print> printList;
	
	public Excel() {}
	
	public Excel(Print print) {
		this.print = print;
		
	}
	
	public Excel(Print print, List<Print> printList) {
		super();
		this.print = print;
		this.printList = printList;
	}
	public void setPrint(Print print) {
		this.print = print;
	}
	public void setPrintList(List<Print> printList) {
		this.printList = printList;
	}
	
	public void excelPrint() {
		print.print();
	}
	public void excelPrinters() {
		for (Print p:printList) {
			p.print();
		}
	}
	
}
