package com;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StringBuffer is mutable
		StringBuffer str=new StringBuffer("hiiiiii");
		//System.out.println(str.delete(0, 3));
		System.out.println(str.reverse());//iiiiiih
		System.out.println(str);//iiiiiih
		
		//String is immutable
		String s="hello";
		System.out.println(s.toUpperCase());//HELLO
		System.out.println(s);//hello
		
		StringBuilder a=new StringBuilder("HELLO");
		a.reverse();
		System.out.println(a);

	}

}
