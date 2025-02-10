package com.rays.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EqualHashCodeTest1 {
	public static void main(String[] args) {
		EqualHashCode e = new EqualHashCode(100, "Shivanshi", 500);
		EqualHashCode e1 = new EqualHashCode(100, "Shivanshi", 500);
		EqualHashCode e2 = new EqualHashCode(2, "Shivanshi", 100);

		List l = new ArrayList();
		//List duplicates allow karta hai aur objects ko as-is store karta hai.

		l.add(e1);
		System.out.println(l);

		l.remove(e1);
		System.out.println(l);

		System.out.println("setttttttttt");
		Set s = new HashSet();
		//Set duplicates allow nahi karta.

		s.add(e);
		System.out.println(s);

		s.add(e1);
		System.out.println(s);

		s.add(e2);
		System.out.println(s);

		System.out.println("mapppppppp");

		Map m = new HashMap();
		//Map key-value pairs store karta hai.


		m.put(1, e);
		m.put(2, e1);
		System.out.println(m + "hhhh");

		m.remove(1, e2);
		System.out.println(m);
	}

}
