package com;


	class A
	{
		int a;

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}
		void show() {
			System.out.println("overriding");
		}
		
	}
	
	class B extends A
	{
		int b;
@override //implies that the same method is present in the super class
		void show() {
			super.show();
			System.out.println("overridden");
		}
		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}
	}

public class Inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob=new B();
		System.out.println(ob.a);
		ob.show();

	}

}
