package com.ves.default_static.method.model;

public class Employee {
	private int id;
	private String name;
	private int age;
	private Gender gender;
	private Designation designation;

	public Employee(int id, String name, int age, Gender gender, Designation designation) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", designation="
				+ designation + "]";
	}

}
