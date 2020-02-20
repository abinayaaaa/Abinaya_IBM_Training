package day1;

import java.util.Scanner;

public class Prog5 {
	public static void main(String[] args) {
		int n,temp,rev=0,dig;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			dig=n%10;
			rev=rev*10+dig;
			n=n/10;
		}
		if(rev==temp)
		{
			int k,fl=0;
			for(k=2;k<rev/2;k++)
			{
				if(rev%k==0)
				{
					fl=1;
					break;
				}
			}
			if(fl==0)
			{
				System.out.println(rev+"p");
			}
			else
				System.out.println("exit");
		}
		else
			System.out.println("exit");
		
		
	}

}
