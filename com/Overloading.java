package com;

public class Overloading {

	double add(int a, double b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading ob = new Overloading();
		System.out.println(ob.add(5, 6));
		System.out.println(ob.add(5, 6.8));
		System.out.println(ob.add(5, 6, 7));

	}

}
