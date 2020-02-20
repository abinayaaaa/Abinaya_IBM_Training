package com;

public class Student {

	String name;
	int id;

	Student() {
		this.name = "none";
		this.id = 10;
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
		Student b1 = new Student();
		System.out.println(b1.getName());
		System.out.println(b1.getId());
	}

}
