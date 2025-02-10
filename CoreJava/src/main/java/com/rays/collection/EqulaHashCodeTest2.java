package com.rays.collection;

import java.util.HashSet;
import java.util.Set;

public class EqulaHashCodeTest2 {
	public static void main(String[] args) {
		EqualHashCode e1 = new EqualHashCode(1, "Shivanshi", 120);
		EqualHashCode e2 = new EqualHashCode(1, "Shivanshi", 120);
		EqualHashCode e3 = new EqualHashCode(10, "Shivanshi", 120);

		if (e1.equals(e2)) {
			if (e1.hashCode() == e2.hashCode())

			System.out.println(e1.equals(e2));
			System.out.println(e1.hashCode());
			System.out.println(e2.hashCode());

			Set s = new HashSet();

			s.add(e1);
			s.add(e3);
			System.out.println(s);
			s.remove(e2);
			System.out.println(s);

		}
	}

}
