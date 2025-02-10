package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeFile {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C://Users//hp//Desktop//IO//paras.txt");

		BufferedReader br = new BufferedReader(new FileReader("C://Users//hp//Desktop//IO//jatin.txt"));

		String s1 = br.readLine(); 

		while (s1 != null) {

			fw.write(s1);

			s1 = br.readLine();
 
		}
		br.close();

		br = new BufferedReader(new FileReader("C://Users//hp//Desktop//IO//kapill.txt"));

		String s2 = br.readLine();

		while (s2 != null) {

			fw.write(s2);

			s2 = br.readLine();

		}
		br.close();
		fw.close();

		System.out.println("success.......");

	}

}
