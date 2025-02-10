package com.rays.collection;

import java.util.HashMap;
import java.util.Map;

public class EqualHasCodeTest4 {
	public static void main(String[] args) {

		EqualHashCode e1 = new EqualHashCode(1, "Shivanshi", 120);
		EqualHashCode e2 = new EqualHashCode(1, "Shivanshi", 120);
		EqualHashCode e3 = new EqualHashCode(1, "Shivanshi", 120);
		EqualHashCode e4 = new EqualHashCode(10, "Shivanshi", 120);

		if (e1.equals(e2)) {
			if (e1.hashCode() == e2.hashCode())

				System.out.println(e1.equals(e2));
			System.out.println(e1.hashCode());
			System.out.println(e2.hashCode());

			Map m = new HashMap();
			m.put(1, e1);
			m.put(2, e2);
			m.put(3, e4);
			System.out.println(m);
			m.remove(1, e2);
			System.out.println(m);
		}
	}
}
