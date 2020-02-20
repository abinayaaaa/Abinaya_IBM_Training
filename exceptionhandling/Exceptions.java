package exceptionhandling;

import java.io.IOException;
import java.sql.SQLException;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		
		System.out.println("prog execution");
		try
		{
			System.out.println(a/0);
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
		}
		finally
		{
			System.out.println("over");
		}
		
		System.out.println("prog execution start");
		System.out.println(a/0);
		System.out.println("exception");
		
		try  //
		{
			throw new ArrayIndexOutOfBoundsException();//unchecked 
			                                 //ie.at runtime hence no error is shown
			throw new IOException();//checked
			                          //i.e at compile time hence error is displayed
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
