package com.array;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class PrimeNumbers {

	List prime = new ArrayList();
	
	public static void main(String[] args) throws IOException
	{
		int res = 0;
	
	
	 ResourceBundle bundle =  ResourceBundle.getBundle("Out");
	BufferedWriter outPut = new BufferedWriter(new FileWriter(bundle.getString("Path")));
	
	Prime prime = new Prime();
	
	prime.getMaxPrimeNumber(10);
	 outPut.write("The Largest Prime Number is :" +prime.getMaxPrimeNumber(res));
	 outPut.close();
		
	
}
}