package com;

public class Wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=4;//primitive typr;
		Integer a=new Integer(4);//wrapper class
		System.out.println(a.byteValue());
		
	   a=b;//assigning primitive to object-autoboxing
	   b=a;//assigning object to primitice-unboxing
	   
	}

}
