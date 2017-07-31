package com.ves.tutorial.methodref;

import java.util.ArrayList;
import java.util.List;

import com.ves.tutorial.methodref.model.Designation;
import com.ves.tutorial.methodref.model.Employee;
import com.ves.tutorial.methodref.model.Gender;

/**
 * This utility class provides method to populate list with sample Employee
 * objects.
 * 
 * @author VES Tutorials
 *
 */
public class DataUtil {
	/**
	 * This method creates list of employee objects and returns it.
	 * 
	 * @return
	 */
	public List<Employee> getEmployeeList() {
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

	public int compareByDesignation(Employee emp1, Employee emp2) {
		return emp1.getDesignation().compareTo(emp2.getDesignation());
	}

}
