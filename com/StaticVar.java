package com;

public class StaticVar {
	String name;
	int id;
	static String colg = "SJCE";

	StaticVar() {
		this.name = "none";
		this.id = 10;
	}

	StaticVar(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	void set(int id, String name) {
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar b1 = new StaticVar();
		System.out.println(b1.getName());
		System.out.println(b1.getId());
		System.out.println(StaticVar.colg);
		StaticVar b2 = new StaticVar("abi", 05);
		System.out.println(b2.getName());
		System.out.println(b2.getId());
		System.out.println(StaticVar.colg);
	}

}
