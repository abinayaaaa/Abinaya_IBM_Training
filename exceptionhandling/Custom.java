package exceptionhandling;

public class Custom {
	static void validate(int age)throws Customexception{  
	     if(age<18)  
	      throw new Customexception("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	      Custom(13);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
	      System.out.println("rest of the code...");  
	  }  
}
