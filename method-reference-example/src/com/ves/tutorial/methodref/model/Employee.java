package com.ves.tutorial.methodref.model;

public class Employee {
	private int id;
	private String name;
	private int age;
	private Gender gender;
	private Designation designation;

	public Employee(Employee emp) {
		this.id = emp.id;
		this.name = emp.name;
		this.age = emp.age;
		this.gender = emp.gender;
		this.designation = emp.designation;
	}

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

	public static int compareByAge(Employee obj1, Employee obj2) {
		return obj1.getAge() - obj2.getAge();
	}

	public int compareByDesignation(Employee obj1, Employee obj2) {
		return obj1.getDesignation().compareTo(obj2.getDesignation());
	}

	public int compareByName(Employee emp) {
		return this.getName().compareToIgnoreCase(emp.getName());
	}

	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", designation="
				+ designation + "]";
	}

}
