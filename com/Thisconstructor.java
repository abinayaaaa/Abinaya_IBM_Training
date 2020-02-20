package com;

public class Thisconstructor {
	int l, w, h;

	Thisconstructor() {
		System.out.println("first");
	}

	Thisconstructor(int l) {
		this();
		System.out.println("second");
		this.l = l;
	}

	Thisconstructor(int l, int w) {
		this(l);
		System.out.println("third");
		this.l = l;
		this.w = w;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thisconstructor ob = new Thisconstructor(90, 87);

	}

}
