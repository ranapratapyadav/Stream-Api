package com.rana.filter;

import java.util.Arrays;

/*
 Find the prime number using stream API
 */

public class FilterDemo5 {

	public static void main(String[] args) 
	{
		int []numbers= {2,4,3,5,7,6,8,9,12,23,67,87,98};
		Arrays.stream(numbers)
			.filter(num -> FilterDemo5.isPrime(num))
				.forEach(n->IO.println(n));
	}
	
	//Method to check number is prime or not [It declared as a private because it is a helper method]
	private static boolean isPrime(int num)
	{
		if(num<2)
		{
			return false;
		}
		for (int i = 2; i <= num/2; i++) 
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}

}
