package com.array;

import java.util.ArrayList;


public class Prime {
	int i,j,result = 0;
	
	ArrayList<Integer> prime = new ArrayList<Integer>();
	
	int getMaxPrimeNumber(int value)
	{
		for(i=0;i<=value;i++)
			
		 {
			 for(j=2;j<i;j++)
			 {
				 int check = i % j;
				 if( check == 0)
				 {
					 break;
				 }
				 
			 }
			 if ( i == j)
			 {
				 result = i;
			 }
		 }
		return result;
		
	}
	
	
	public ArrayList<Integer> ListOfPrimeNumbers(int value)
	{
		for(i=0;i<=value;i++)
		{
			for(j=2;j<i;j++)
			{
				int check = i % j;
				if( check == 0){
					break;			
				}
			}
			if( i == j)
			{
				prime.add(i);
			}
		}
		return prime;
	}
	
	public boolean isPrime(int value) {
		boolean res = false;
		int count =0;
		for(i=1;i<=value;i++){
			

				int check = value % i;
				if( check == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				res = true;
					
			}
		
		return res;
		
	}
	

}