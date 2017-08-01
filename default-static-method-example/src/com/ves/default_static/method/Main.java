package com.ves.default_static.method;

import static java.lang.System.out;

import java.util.List;

import com.ves.default_static.method.model.Designation;
import com.ves.default_static.method.model.Employee;
import com.ves.default_static.method.model.Gender;

public class Main {
	public static void main(String[] args) {
		IEmployee employeeService = new EmployeeImpl();
		employeeService.save(new Employee(1, "John", 23, Gender.MALE, Designation.CLERK));
		employeeService.save(new Employee(2, "Alfie", 24, Gender.MALE, Designation.CLERK));
		employeeService.save(new Employee(3, "Andrew", 23, Gender.MALE, Designation.CLERK));
		employeeService.save(new Employee(4, "Adriel", 27, Gender.FEMALE, Designation.SENIOR_MANAGER));
		employeeService.save(new Employee(5, "Micah", 32, Gender.MALE, Designation.DIVISIONAL_MANAGER));

		List<Employee> employeeList = employeeService.listAll();
		employeeList.forEach(employee -> out
				.println(employee.getId() + ", " + employee.getName() + ", " + employee.getDesignation()));
		
		Employee employee = employeeService.find(3);
		System.out.println(employee);
	}
}
