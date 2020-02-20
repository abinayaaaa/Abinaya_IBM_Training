package day1;

import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>144)
		{
			System.out.println("gross="+n/144);
			n=n%144;
			System.out.println("dozen="+n/12);
			System.out.println("remaining="+n%12);
			
		}
		else
		{
			System.out.println("dozen="+n/12);
			System.out.println("remaining="+n%12);
		}
		

}
}