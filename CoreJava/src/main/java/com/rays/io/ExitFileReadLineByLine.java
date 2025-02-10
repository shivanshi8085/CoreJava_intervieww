package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExitFileReadLineByLine {
	public static void main(String[] args) throws IOException {
		
		FileWriter file = new FileWriter("C:\\Users\\hp\\Desktop\\IO\\jatinkapi.txt", true);

		PrintWriter out = new PrintWriter(file);

		out.println("hello bhai");

		out.println("kkrh??");
 
		out.close();

		
		file.close();

		System.out.println("data write successfully...!!!");


	}

}
