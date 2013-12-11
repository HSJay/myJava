package com.demo.io.buffer;
import java.io.*;
public class BufferedReaderDemo{
	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Please enter something: ");
		System.out.println("(PS:You can  input a space)");
		String text = bufferedReader.readLine();
		System.out.printf("What you typed is :%n" + text);
	}
}