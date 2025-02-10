package com.rays.comparator;

import java.util.Comparator;

public class EmployeeShortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
        return o1.getName().compareTo(o2.getName());
	}

}
