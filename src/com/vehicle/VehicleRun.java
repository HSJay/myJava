package com.vehicle;

public class VehicleRun implements Vehicle{
	public void move(int m){
		System.out.println("Move "+ m +" meters");
	}
	public static void main(String[] args){
		Vehicle run = new VehicleRun();
		int i;
		for(i=0 ; i < 5; i++ )
			run.move(i);
	}
}
		