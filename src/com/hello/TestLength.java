package com.hello;

public class TestLength{
	public static void main(String[] args){
		int i ;
		String[] a={"apple","banana","capital"};
		System.out.print("The string array size is: ");
		System.out.println(a.length);
		System.out.print("The elements are: ");
		for(i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}	
}