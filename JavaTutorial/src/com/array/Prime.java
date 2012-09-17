package com.array;

import java.util.ArrayList;
import java.util.List;

public class Prime {
	int i,j,res = 0;
	
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
				 res = i;
			 }
		 }
		return res;
		
	}
	
/*	ArrayList ListOfPrimeNumbers(int value)
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
				res = i;
			}
			return (ArrayList) res;
		}
	}
*/
}
