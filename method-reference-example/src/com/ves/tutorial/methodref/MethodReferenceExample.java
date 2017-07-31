package com.ves.tutorial.methodref;

import static java.lang.System.out;

import java.util.List;

import com.ves.tutorial.methodref.model.Designation;
import com.ves.tutorial.methodref.model.Employee;
import com.ves.tutorial.methodref.model.Gender;

/**
 * This tutorials helps you to understand the purpose of method reference.
 * 
 * @author VES Tutorials
 *
 */
public class MethodReferenceExample {
	public static void main(String[] args) {
		DataUtil dataUtil = new DataUtil();

		List<Employee> employeeList = dataUtil.getEmployeeList();

		// This method sorts employee by employee age using static method
		// reference
		employeeList.sort(Employee::compareByAge);

		// Print the sorted list with Iterable.forEach() method and lambda
		// expression.
		out.println("Sorted by emp age");
		employeeList.forEach(emp -> out.println(emp.getId() + ", " + emp.getAge() + ", " + emp.getName()));

		// This method sorts employee by employee designation using instance
		// method reference
		employeeList.sort(dataUtil::compareByDesignation);

		// Print the sorted list with Iterable.forEach() method and lambda
		// expression.
		out.println("Sorted by emp designation");
		employeeList.forEach(emp -> out.println(emp.getId() + ", " + emp.getName() + ", " + emp.getDesignation()));

		// This method sort employee by employee names using type method
		// reference
		employeeList.sort(Employee::compareByName);
		employeeList.forEach(emp -> out.println(emp.getName() + ", " + emp.getAge()));

		// Here we have used constructor reference to instantiate empInt.
		EmployeeInt empInt = Employee::new;
		Employee emp = empInt.copyEmployee(11, "Paul", 28, Gender.MALE, Designation.OFFICER);
		System.out.println(emp);
	}
}
