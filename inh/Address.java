package inh;

public class Address {
	
	String location;
	int doorno;
	
	public Address(String location, int doorno) {
		this.location = location;
		this.doorno = doorno;
	}


	@Override
	public String toString() {
		return "Address [location=" + location + ", doorno=" + doorno + "]";
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getDoorno() {
		return doorno;
	}

	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
