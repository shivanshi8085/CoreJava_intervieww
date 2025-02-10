 package com.rays.stream.api;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSalaryTest {
	public static void main(String[] args) {
		
		List<EmployeeSalary> list = new ArrayList<EmployeeSalary>();

		list.add(new EmployeeSalary(20000, "shivanshi"));
		list.add(new EmployeeSalary(25000, "Lansi"));
		list.add(new EmployeeSalary(1000, "ravi"));
		list.add(new EmployeeSalary(522, "nansi"));
		list.add(new EmployeeSalary(600, "pranshu"));

		list.stream().distinct().filter(c -> (c.getSalary() >= 20000))
				.forEach(c -> System.out.println(c.getSalary() + "=" + c.getName()));

	}

}
