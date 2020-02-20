package thread;

	public class Joinmethod extends Thread {

		public static void main(String[] args)throws InterruptedException//for join
		{
			// TODO Auto-generated method stub
			Joinmethod t=new Joinmethod();
			Joinmethod t1=new Joinmethod();
			Joinmethod t2=new Joinmethod();
			t.start();
			t.join();
			t1.start();
			t2.start();
		}
		

		@Override
		public void run() {
			super.run();
			// TODO Auto-generated method stub
			for(int i=1;i<=10;i++)
			{
				try {
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				System.out.println(i);
			}
			
		}

	}



