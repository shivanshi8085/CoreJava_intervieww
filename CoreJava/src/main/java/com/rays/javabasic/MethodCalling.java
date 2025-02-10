package com.rays.javabasic;

public class MethodCalling {

	// Method to find the index of the number in the array
	public static int index(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			// Compare each element with the given number
			if (arr[i] == num) {
				return i; // Return the index if found
			}
		}
		return -1; // Return -1 if not found
	}

	public static void main(String[] args) {
		int[] arr = { 10, 30, 15, 20 };
		int num = 20;

		int index = index(arr, num); // Call the method to find the index
		System.out.println(index);
	}

}
