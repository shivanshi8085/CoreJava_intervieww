package com.rays.stream.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeNameTest {
	public static void main(String[] args) {
		List<Employee> l = new ArrayList();
		l.add(new Employee(1, "shiv"));
		l.add(new Employee(4, "ravi"));
		l.add(new Employee(2, "sakshi"));
		l.add(new Employee(8, "jiva"));

		l.stream().sorted(Comparator.comparing(Employee::getName))
				.forEach(e -> System.out.println(e.getId() + " = " + e.getName()));

	}

}
