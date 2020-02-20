package inh;

public class Employee {
	String name, location;
	int sal, id;
	Address ad;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", location=" + location + ", sal=" + sal + ", id=" + id + ", ad=" + ad + "]";
	}

	
	
	Employee(String name,int id,int sal,String location,Address ad) {
	// TODO Auto-generated constructor stub
		this.name=name;
		this.id=id;
		this.location=location;
		this.sal=sal;
		this.ad=ad;
}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	

}
