package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharReadAndWrite {
	public static void main(String[] args) throws IOException {
		
		String source = "C://Users//hp//Desktop//IO//Jai Hanuman.jpeg";
		String target = "C://Users//hp//Desktop//IO//mahiiii.jpg";
		
		FileReader fr = new FileReader(source);
		FileWriter fw = new FileWriter(target);
		
		int ch;
		
		while((ch = fr.read())!= -1) {
			fw.write(ch);
			
		}
		fr.close();
		fw.close();
		
 	}

}
