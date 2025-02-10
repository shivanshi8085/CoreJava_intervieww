package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadAndWriteLine {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dipan\\OneDrive\\Documents\\shivanshi.txt"));
		PrintWriter out =new PrintWriter(new FileWriter("C:\\Users\\dipan\\OneDrive\\Documents\\shiv.txt"));
		
		String str= br.readLine();
		while(str!=null) {
			out.write(str);
			System.out.println(str);
			
			str=br.readLine();
			
		}
		out.close();
		br.close();
		
	}

}
