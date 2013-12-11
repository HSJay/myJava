package com.demo.io.scanner;
import java.util.Scanner;
public class ScannerDemo{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your name:");
		System.out.printf("Hi!!!! %s !\n",scanner.next());
		System.out.print("Please enter a number:");
		System.out.printf("The number is %d",scanner.nextInt());
	}
}