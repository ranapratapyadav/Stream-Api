package com.rana.map;

import java.util.Arrays;

//Replace all the negative value to 0

public class MapDemo4 {

	public static void main(String[] args) 
	{
		int [] arr= {12,-2,4,56,-8,-98};
		int []array=Arrays.stream(arr)
						.map(num->num<0 ? 0:num)
						.toArray();
		System.out.println("Original arr");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Array after replacing negative value:");
		System.out.println(Arrays.toString(array));
	}

}
