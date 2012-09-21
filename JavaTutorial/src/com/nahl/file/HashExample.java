package com.nahl.file;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashExample {
	
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ahmad");
		list.add("Isimdar");
		list.add("Maaz");
		list.add("kaif");
	    list.add("nahl");
		list.add("kaif");
		list.add("504");
		
		
		HashExample duplicateList = new HashExample();
		
		System.out.println(duplicateList.Duplicate(list));
		
	}

	public  List Duplicate(ArrayList list){
		
		HashSet hashList = new HashSet(list);
		List words = new ArrayList();
		words.addAll(hashList);
		return words;
		
	}
}
