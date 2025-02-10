package com.rays.exception;

public class TryWithMultiCatchFInally {

	public static void main(String[] args) {
		// String s = null;
		String s = "abc";
		try {
			

			System.out.println(s.length());
			System.out.println(s.charAt(5));
			//System.exit(0);

		} catch (NullPointerException e) {
			System.out.println(e);
			// System.exit(0);

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
			 System.exit(0);
		}

		finally {
			System.out.println("Finally block");
		}
	}

}
