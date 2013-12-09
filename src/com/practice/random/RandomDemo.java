package com.practice.random;
import java.util.Random;

public class RandomDemo{
	public static void main(String[] args){
		Random ran = new Random();
		System.out.println(ran.nextInt(101)+107);
	}
}