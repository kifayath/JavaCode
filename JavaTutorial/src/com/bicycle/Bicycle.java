package com.bicycle;

public class Bicycle {
private	int cadence = 0;
private	int gear = 1;
private	int speed = 0;
	
	void changeCadence(int newValue) {
		cadence = newValue;
	}
	void SpeedUp(int increaseSpeed) {
		speed = speed + increaseSpeed;
	}
	void SpeedDown(int decreaseSpeed) {
		speed = speed - decreaseSpeed;
	}
	void changeGear(int newValue) {
		gear = newValue;
	}
	void printStates() {
		System.out.println("Cadence: "+cadence+"Speed: "+speed+"Gear: "+gear);
	}

}
