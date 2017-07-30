package com.ves.tutorial.lambda;

import static com.ves.tutorial.lambda.DataUtil.getEmployeeList;
import static java.lang.System.out;

import java.util.Collections;
import java.util.List;

import com.ves.tutorial.lambda.model.Employee;

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
		employeeList.sort((a, b) -> a.getDesignation().compareTo(b.getDesignation()));

		// Print the sorted list with Iterable.forEach() method and lambda
		// expression.
		out.println("Sorted by emp designation");
		employeeList.forEach(emp -> out.println(emp.getId() + ", " + emp.getName() + ", " + emp.getDesignation()));
	}
}
