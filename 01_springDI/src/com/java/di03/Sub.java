package com.java.di03;

public class Sub {
	private int x;
	private int y;
	
	public Sub() {}
	public Sub(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Sub [x=" + x + ", y=" + y + "]";
	}
	
}
