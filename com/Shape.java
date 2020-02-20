package com;

public abstract class Shape{
	abstract double area(int l,int w);
	void display() {
		System.out.println("shape");
	}
	
}
class Rectangle extends Shape{
	int l,w;

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	@Override
	double area(int l,int w) {
		// TODO Auto-generated method stub
		System.out.println(l*w);
		return 0;
	}
	
}


