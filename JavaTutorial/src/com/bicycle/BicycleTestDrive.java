package com.bicycle;

public class BicycleTestDrive {
	public static void main(String[] args)
	{
		Bicycle bicycle1 = new Bicycle();
		Bicycle bicycle2 = new Bicycle();
		
		bicycle1.changeCadence(50);
		bicycle1.SpeedUp(65);
		bicycle1.SpeedDown(12);
		bicycle1.changeGear(4);
		bicycle1.printStates();
		
		bicycle2.changeCadence(32);
		bicycle2.changeGear(5);
		bicycle2.SpeedDown(34);
		bicycle2.SpeedUp(57);
		bicycle2.printStates();
	}
}
