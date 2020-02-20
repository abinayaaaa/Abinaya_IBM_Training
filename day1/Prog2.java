package day1;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=" ";
		int tax;
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		tax=sc.nextInt();
		if(s1=="general")
		{
			if(0<=tax && tax<=180000)
			{
				System.out.println("no tax");
			}
			else if(tax>180001 && tax<=500000)
			{
				System.out.println(0.1*tax);
			}
			else if(tax>=500001 && tax<=800000)
			{
				System.out.println(0.2*tax);
			}
			else if(tax>=800001)
			{
				System.out.println(0.3*tax);
			}
		}
		else
		{
			if(0<=tax && tax<=190000)
			{
				System.out.println("no tax");
			}
			else if(tax>190001 && tax<=500000)
			{
				System.out.println(0.1*tax);
			}
			else if(tax>=500001 && tax<=800000)
			{
				System.out.println(0.2*tax);
			}
			else if(tax>=800001)
			{
				System.out.println(0.3*tax);
			}
		}

	}

}
