package thread;

//by extending thread class

public class Threads1 extends Thread {

/*	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}*/
	
	public static void main(String[] args) throws InterruptedException{
		Threads1 t1=new Threads1();
		Threads1 t2=new Threads1();
		Threads1 t3=new Threads1();
		t1.start();
		//t1.join();
		/*try
		{
		Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}*/
		t2.start();
		t2.join();
		t3.start();
		
		
	}

}
