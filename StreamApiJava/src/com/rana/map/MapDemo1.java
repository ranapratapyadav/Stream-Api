package com.rana.map;

//Take some fruits as array and find the length of all the element in the array


import java.util.Arrays;

public class MapDemo1 
{
	public static void main(String[] args) 
	{
		String[] fruits= {"Apple","Banana","Grapes","pear","Pomegranate"};
//		Arrays.stream(fruits)
//			.map(fruit->fruit.length())
//				.forEach(IO::println);
		
		Object [] fruit=Arrays.stream(fruits)
							.map(fr->fr.length())
								.toArray();
		System.out.println(Arrays.toString(fruit));
	}
}
