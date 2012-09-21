package com.array;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

public class PrimeNumbers {

	List<Integer> prime = new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException
	{
	
	
	 ResourceBundle bundle =  ResourceBundle.getBundle("Out");
	BufferedWriter outPut = new BufferedWriter(new FileWriter(bundle.getString("Path1")));
	
	Prime prime = new Prime();
	
//	 outPut.write("The Largest Prime Number is :" +prime.getMaxPrimeNumber(10));
	
	long lStartTime = new Date().getTime(); //start time	
	//outPut.write("Prime COunt is :"+prime.ListOfPrimeNumbers(100000).size());

	outPut.write("The Prime Value is :"+prime.isPrime(1000));
	outPut.close();
	
	 long lEndTime = new Date().getTime(); //end time
	 
	 long difference = lEndTime - lStartTime; //check different
	 
     System.out.println("Elapsed milliseconds: " + difference);
}
}