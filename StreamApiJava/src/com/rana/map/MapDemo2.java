package com.rana.map;

import java.util.Arrays;

public class MapDemo2 {

	public static void main(String[] args) 
	{
		int [] arr= {10,23,5,6,47,8,9};
		int []array=Arrays.stream(arr)
			.map(n->n+5)
//				.forEach(IO::println);
				.toArray();
		System.out.println(Arrays.toString(array));
		

	}

}
