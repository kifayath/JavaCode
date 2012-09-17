package com.dog;

public class Dog {
	
	private String name;
	private String color;
	private String breed;
	private String hungry;
	private String barking;
	
	void setName(String name) {
		this.name = name;
	}
	void setColor(String color){
		this.color = color;
	}
	void TypeOfbreed(String breed){
		this.breed = breed;
	}
	void IsHungry(String hungry){
		this.hungry = hungry;
	}
	void barking(String barking){
		this.barking = barking;
	}
	
	void show(){
		System.out.println(" Dog Name: "+name+" Dog color :"+color+" Dog Breed :"+breed+" Is Dog Hungry :"+hungry+" Barking :"+barking);
	}

}
