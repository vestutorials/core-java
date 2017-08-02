package com.ves.tutorial.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.ves.tutorial.streams.model.Designation;
import com.ves.tutorial.streams.model.Employee;

public class Main {
	public static void main(String[] args) {
		List<Employee> employeeList = DataUtil.getEmployeeList();

		List<String> clerkNames = employeeList.stream()
				.filter(employee -> employee.getDesignation() == Designation.CLERK)
				.sorted(Comparator.comparing(Employee::getAge).reversed())
				.map(Employee::getName)
				.collect(Collectors.toList());
		
		System.out.println(clerkNames);
	}

}
