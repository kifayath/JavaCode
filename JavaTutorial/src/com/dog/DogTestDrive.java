package com.dog;

public class DogTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		dog1.setName("Jumi");
		dog1.setColor("black");
		dog1.TypeOfbreed("German Shepherd Dog");
		dog1.IsHungry("Yes");
		dog1.barking("Ruff Ruff");
		dog1.show();
		
		dog2.setName("John");
		dog2.setColor("golden");
		dog2.TypeOfbreed("Companion Dog");
		dog2.IsHungry("no");
		dog2.barking("Ruff Ruff");
		dog2.show();

	}

}
