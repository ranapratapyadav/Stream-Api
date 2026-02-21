package com.rana.filter;

import java.util.Arrays;

/*
 Write a program print all the array which is divided by 3 and 5
 */

public class FilterDemo3 {

	public static void main(String[] args) 
	{
		int []arr= {15,20,25,45,65,78,45,96,24,56};
		Arrays.stream(arr)
			.filter(num->num%3==0 && num%5==0)
				.forEach(n->IO.println(n));
	}

}
