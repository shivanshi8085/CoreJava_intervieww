package com.rays.javabasic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Example2 implements Serializable{
	
	 public void display() {
	        System.out.println("Object created using deserialization");
	    }

	    public static void main(String[] args) throws Exception {
	       
	            // Serialize the object
	            Example2 original = new Example2();
	            FileOutputStream fos = new FileOutputStream("example.ser");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(original);
	            oos.close();

	            // Deserialize the object
	            FileInputStream fis = new FileInputStream("example.ser");
	            ObjectInputStream ois = new ObjectInputStream(fis);
	            Example2 deserialized = (Example2) ois.readObject();
	            ois.close();

	            deserialized.display();
	      
	    }

}
