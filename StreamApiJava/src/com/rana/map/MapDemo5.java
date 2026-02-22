package com.rana.map;

import java.util.Arrays;

//WAP to extract first character of every element of the given array
public class MapDemo5 {

	public static void main(String[] args) 
	{
		String []	names= {"Jaya","Arav","Vaibhav","Ayush"};
		Object[]name=Arrays.stream(names)
						.map(nam->nam.charAt(0))
							.toArray();
		System.out.println(Arrays.toString(name));
	}

}
