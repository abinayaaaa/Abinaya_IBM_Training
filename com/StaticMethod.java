package com;

public class StaticMethod {
	static int a;
	int b; // instance variables

	static void setA() //static method
	{
		int c = 0; // local variable
		System.out.println(c);
		System.out.println(a);
		// System.out.println(b); will give error
	}

	static // static block
	{
		a = 10;
		System.out.println("static block has higher priority so executes first");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setA(); // no need object to access static members or variables
		StaticMethod ob = new StaticMethod();
		System.out.println(ob.b); // need to create object to access instance variables
	}

}
