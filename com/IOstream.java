package com;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class IOstream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//writing
		FileOutputStream fout=new FileOutputStream("D:\\eclipse java\\eclipse_java\\eclipse\\test.txt");
		fout.write(90);
		fout.write(65);
		
		String s="sdhsdhs343";
		byte b[]=s.getBytes();
		fout.write(b);
		
		fout.close();
		
		FileInputStream fin=new FileInputStream("D:\\eclipse java\\eclipse_java\\eclipse\\test.txt");
		int i=0;
		while((i=fin.read())!=-1)
		{
		System.out.print((char)i);
		}
		fin.close();
	}

}
