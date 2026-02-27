package com.rana.filter;

import java.util.Arrays;

public class NamesWithSpecificLetter {
	
	void main()
	{
		int size=Integer.parseInt(IO.readln("Enter the size of the array"));
		 String []names=new String[size];
		 for(int i=0;i<names.length;i++)
		 {
		 names[i]=IO.readln("Enter the element of the array: ");
		 }
		 Object[] name=Arrays.stream(names)
		 .filter(n->n.toLowerCase().contains("a"))
		 .toArray();

		 IO.println("Original Array: "+Arrays.toString(names));
		 System.out.println("Names Containing 'A' or 'a': "+Arrays.toString(name));
		 }

	}


