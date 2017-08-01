package com.ves.default_static.method;

import java.util.List;

import com.ves.default_static.method.model.Employee;

/**
 * Implementation for IEmployee interface.
 * 
 * @author VES Tutorials
 *
 */
public class EmployeeImpl implements IEmployee {

	@Override
	public void save(Employee employee) {
		employeeList.add(employee);
	}

	@Override
	public Employee find(int employeeId) {
		return employeeList.stream().filter(employee -> {
			return employee.getId() == employeeId;
		}).findFirst().get();
	}

	@Override
	public List<Employee> listAll() {
		return employeeList;
	}

}
