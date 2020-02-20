package com;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pi=3.14;
	}

}

class FinalMethod{
	final void show() {
		System.out.println("final method");
	}
	
}

class B extends FinalMethod{
	void show()
	{
		super.show();
	}
}