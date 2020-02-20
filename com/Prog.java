package com;

public class Prog {
	int l, w, h;
	static int i=0;
	static String company = "xyz";

	Prog() {
		this.l = 10;
		this.w = 10;
		this.h = 10;
		i=i+1;
		System.out.println(i);
	}

	/*Prog(int a, int b, int c) {
		this.l = a;
		this.w = b;
		this.h = c;
	}*/

	static void change() {
		company = "abc";
	}

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

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public void volume(int l, int w, int h) {
		System.out.println(l * w * h);
	}

	public static void main(String[] args) {
		Prog ob = new Prog();
		System.out.println(Prog.company);
		System.out.println("l=" + ob.l + " w=" + ob.w + " h=" + ob.h);
		Prog ob1 = new Prog();
		//Prog ob1 = new Prog(20,30,40);
		//System.out.println("l=" + ob1.l + " w=" + ob1.w + " h=" + ob1
				//.h);
		ob.volume(10,20,30);
		

	}

}
