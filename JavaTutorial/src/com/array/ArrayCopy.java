package com.array;


class ArrayCopy
{
public static void main(String[] args)
{

	char[] copyFrom = {'k','i','f','a','y','a','t','h' };
	char[] copyTo = new char[8];
	
	System.arraycopy(copyFrom, 3, copyTo, 0, 5);
	System.out.println(copyTo);
}
}