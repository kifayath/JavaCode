package com.array;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int r=0;
		int n=786;
		while(n>=1){
		int m=n%10;
		r=10*r+m;
		n=n/10;
		}
		System.out.println(r);
		System.out.println("hiiiiiii");

	}

}