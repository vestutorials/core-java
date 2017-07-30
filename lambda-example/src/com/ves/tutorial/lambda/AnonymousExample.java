package com.ves.tutorial.lambda;

import static com.ves.tutorial.lambda.DataUtil.getEmployeeList;
import static java.lang.System.out;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ves.tutorial.lambda.model.Employee;

/**
 * @author VES Tutorials
 *
 */
public class AnonymousExample {
	public static void main(String[] args) {
		List<Employee> employeeList = getEmployeeList();
		// Shuffle the collection
		Collections.shuffle(employeeList);
		out.println(employeeList);

		// Here we have used anonymous class to sort an Employee object by age.
		employeeList.sort(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getAge() - o2.getAge();
			}
		});

		// Printing sorted employees
		out.println("Sorted by employee age");
		for (Employee emp : employeeList) {
			out.println(emp.getId() + ", " + emp.getAge() + ", " + emp.getName());
		}

		// Here we have used anonymous class to sort an Employee object by age.
		employeeList.sort(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getDesignation().compareTo(o2.getDesignation());
			}
		});

		// Printing sorted employees
		out.println("Sorted by employee designation");
		for (Employee emp : employeeList) {
			out.println(emp.getId() + ", " + emp.getName() + ", " + emp.getDesignation());
		}
	}

}
