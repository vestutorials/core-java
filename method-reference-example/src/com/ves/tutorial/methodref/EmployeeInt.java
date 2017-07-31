package com.ves.tutorial.methodref;

import com.ves.tutorial.methodref.model.Designation;
import com.ves.tutorial.methodref.model.Employee;
import com.ves.tutorial.methodref.model.Gender;

public interface EmployeeInt {
	public Employee copyEmployee(int id, String name, int age, Gender gender, Designation designation);
}
