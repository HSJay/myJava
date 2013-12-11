package com.demo.exception;

public class CheckArgsDemo{
	public static void main(String[] args){
		try{
			System.out.printf("Execution %s Function%n",args[0]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.printf("There's no reference.");
			e.printStackTrace();
		}
		finally{
			System.out.println("This is a Exception test code!");
		}
	}
}