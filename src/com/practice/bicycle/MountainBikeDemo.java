package com.practice.bicycle;
import com.practice.bicycle.*;
public class MountainBikeDemo{
	public static void main(String[] args){
		MountainBike myBike = new MountainBike( 20 , 1 , 2 ,3);// MountainBike( startHeight,  startCadence, startSpeed, startGear)
		System.out.println("The seatHeight is " + myBike.seatHeight );//The seatHeight is 20
		System.out.println("The cadence is " + myBike.cadence );//The cadence is  1
		System.out.println("The gear is " + myBike.gear );//The gear is 3
		System.out.println("The speed is " + myBike.speed );//The speed is 2
		myBike.speedUp(5);
		System.out.println("The new speed is " + myBike.speed );//The speed is 7
	}
}