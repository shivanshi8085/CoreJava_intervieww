package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCharByChar {
	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("C://kapil//readchar.txt");

		int i = file.read();

		while (i != -1) {

			System.out.print((char) i);

			i = file.read();

		}

		file.close();
	}

}
