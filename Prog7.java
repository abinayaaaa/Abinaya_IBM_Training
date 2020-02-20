package day1;
import java.lang.Math;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k,fl=0,i;
		System.out.println(Math.cbrt(2));
		for(i=3;i<=100;i=i+2)
		{
			for(k=2;k<=i && i%k!=0;k++);
			
				if(i==k)
				{
					
					System.out.println(Math.cbrt(i));
				}
			
		
				

		}
	}
}
