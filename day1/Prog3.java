package day1;

import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c,d;
		int num; 
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		num=sc.nextInt();
		d=sc1.nextInt();
		switch(num)
		{
		case 1:	a=22.50;
			    System.out.println(a*d);
				break;
		case 2:	b=44.50;
				System.out.println(b*d);
				break;
		case 3:	c=9.98;
				System.out.println(c*d);
				break;

		}
	}

}
