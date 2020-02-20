package synchronise;

/* if the keyword 'synchronized' is not used then the output is obtained as 
 * 5,100,10,200....(like usual working of sleep method)
 * when synchronized keyword is used,only one process takes place at a time
 * 
 */
class Table{  
	 synchronized void printTable(int n){//synchronized method  
	   for(int i=1;i<=5;i++){  
	     System.out.println(n*i);  
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
	   }  
	  
	 }  
	}  
	  
	class MyThread1 extends Thread{  
	Table t;  
	MyThread1(Table t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(5);  
	}  
	  
	}  
	class MyThread2 extends Thread{  
	Table t;  
	MyThread2(Table t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(100);  
	}  
	}  
	
	  
	public class SynchronizedMethod{  
	public static void main(String args[]){  
	Table obj = new Table();//only one object  
	MyThread1 t1=new MyThread1(obj);  
	MyThread2 t2=new MyThread2(obj);  
	t1.start();  
	t2.start();  
	}  
	}  