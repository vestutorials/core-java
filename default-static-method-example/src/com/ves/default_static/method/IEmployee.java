package com.ves.default_static.method;

import java.util.ArrayList;
import java.util.List;

import com.ves.default_static.method.model.Employee;

/**
 * This interface declares the functionalities of Employee object.
 * 
 * @author VES Tutorials
 *
 */
public interface IEmployee {
	final List<Employee> employeeList = new ArrayList<Employee>();

	public void save(Employee employee);

	public Employee find(int employeeId);

	public List<Employee> listAll();

	public default void sortByAge() {
		employeeList.sort(IEmployee::compareByAge);
	}

	public static int compareByAge(Employee e1, Employee e2) {
		return e1.getAge() - e2.getAge();
	}
}
