package com.tnsif.exceptionHandling;

import java.io.*;

public class CheckedExample {

	public static void main(String[] args) throws IOException {
			FileReader file = new FileReader("data1.txt");
			BufferedReader fileInput = new BufferedReader(file);
			System.out.println(fileInput.readLine());
			fileInput.close();
	}

}