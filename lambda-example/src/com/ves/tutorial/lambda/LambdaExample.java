package com.ves.tutorial.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ves.tutorial.lambda.model.Designation;
import com.ves.tutorial.lambda.model.Employee;
import com.ves.tutorial.lambda.model.Gender;

import static java.lang.System.out;

/**
 * This tutorials helps you to understand the lambda expression.
 * 
 * @author VES Tutorials
 *
 */
public class LambdaExample {
	public static void main(String[] args) {
		List<Employee> employeeList = getEmployeeList();
		// Shuffle the collection
		Collections.shuffle(employeeList);
		out.println(employeeList);

		// This method sort employee by employee age with Lambda Expression
		employeeList.sort((a, b) -> a.getAge() - b.getAge());

		// Print the sorted list with Iterable.forEach() method and lambda
		// expression.
		out.println("Sorted by emp age");
		employeeList.forEach(emp -> out.println(emp.getId() + ", " + emp.getAge() + ", " + emp.getName()));

		// This method sort employee by employee designation with Lambda
		// Expression
		out.println("Sorted by emp designation");
		employeeList.sort((a, b) -> a.getDesignation().compareTo(b.getDesignation()));

		// Print the sorted list with Iterable.forEach() method and lambda
		// expression.
		employeeList.forEach(emp -> out.println(emp.getId() + ", " + emp.getName() + ", " + emp.getDesignation()));
	}

	/**
	 * This method creates list of employee objects and returns it.
	 * 
	 * @return
	 */
	private static List<Employee> getEmployeeList() {
		// Creating and adding list of Employee objects into the ArrayList.
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "John", 23, Gender.MALE, Designation.CLERK));
		employeeList.add(new Employee(2, "Alfie", 24, Gender.MALE, Designation.CLERK));
		employeeList.add(new Employee(3, "Andrew", 23, Gender.MALE, Designation.CLERK));
		employeeList.add(new Employee(4, "Adriel", 27, Gender.FEMALE, Designation.SENIOR_MANAGER));
		employeeList.add(new Employee(5, "Micah", 32, Gender.MALE, Designation.DIVISIONAL_MANAGER));
		employeeList.add(new Employee(6, "Omar", 37, Gender.MALE, Designation.ASSISTANT_GENERAL_MANAGER));
		employeeList.add(new Employee(7, "Titus", 40, Gender.MALE, Designation.DEPT_GENERAL_MANAGER));
		employeeList.add(new Employee(8, "Diana", 24, Gender.FEMALE, Designation.OFFICER));
		employeeList.add(new Employee(9, "Isaac", 25, Gender.MALE, Designation.OFFICER));
		employeeList.add(new Employee(10, "Eva", 26, Gender.FEMALE, Designation.MANAGER));
		return employeeList;
	}
}
