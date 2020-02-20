package thread;


public class Threads2 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threads2 r=new Threads2();
		Thread t=new Thread(r);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
	}

}
