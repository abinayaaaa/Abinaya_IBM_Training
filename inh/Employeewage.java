package inh;

public class Employeewage extends Employee {
	
	@Override
	public String toString() {
		return "Employeewage [hrs=" + hrs + ", rate=" + rate + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	int hrs,rate;
	
	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public Employeewage(String name,int id,int sal,String location,int hrs,int rate) 
	{
		super(name,id,sal,location);
		this.rate=rate;
		this.hrs=hrs;
	}


}
