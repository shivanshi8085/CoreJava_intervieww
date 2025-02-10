package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine {
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\hp\\Desktop\\IO\\readline.txt");

		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine();

		while (str != null) {
			System.out.println(str);

			str = br.readLine();

		}
		fr.close();
		br.close();

	}

}
