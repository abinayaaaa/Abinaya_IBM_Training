package com;
import java.io.Serializable;
import java.io.*;

public class Serialization implements Serializable {

	//int id;
	transient int id;  //id is not serialised.output is given as 0
	String name;
	public Serialization(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) throws Exception
	{
		//serialization
		Serialization s=new Serialization(86, "sds");
		FileOutputStream fout=new FileOutputStream("D:\\eclipse java\\eclipse_java\\eclipse\\serialisation.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);//as objects are used
		out.writeObject(s);
		out.flush();
		out.close();
		
		//deserialization
		FileInputStream fin=new FileInputStream("D:\\eclipse java\\eclipse_java\\eclipse\\serialisation.txt");
		ObjectInputStream in=new ObjectInputStream(fin);//as objects are used
		Serialization s1=(Serialization)in.readObject(); 
		System.out.println(s1.id+" "+s1.name);
		in.close();
	}

}
