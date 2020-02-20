package com;

public class Innerclass {  //member innerclass
	private int a=90;
	class Inner
	{
		void msg()
		{
			System.out.println("msg");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Innerclass ob=new Innerclass();
		Innerclass.Inner in=ob.new Inner();
		in.msg();

	}

}
//refer other types examples from javapoint