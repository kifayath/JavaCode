package com.dog;

public class DogImplements implements DogInterface {

	 public void barking(){
		 System.out.println("Ruff Ruff");
	 }

	@Override
	public void fetching(String fetch) {
		// TODO Auto-generated method stub
		System.out.println("Dog Fetching the boll");
		
	}
	

}
