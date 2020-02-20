package day1;

import java.util.Random;
import java.lang.Math;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rad=new Random();
		int num=rad.nextInt(100);
		System.out.println(num);
		System.out.println(Math.ceil(num));
		System.out.println(Math.floor(num));

	}

}
