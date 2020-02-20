package in;

interface runnable
{
	void run(;)
}
interface flyable extends runnable  //one interface can extend another interface
{
	double speed=900;
	void fly();
	void pause();
}
class Automobile
{
	
}

class Air extends Automobile implements flyable
{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("fast");
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("stop");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Air ob=new Air();
		ob.fly();
		ob.pause();
		System.out.println(flyable.speed);
	}

}
