package com.rana.filter;

import java.util.Arrays;


/*
 Retrieving the even data from the array by removing the duplicaye and provide sorting ascending uding stream api 
 */
public class FilterDemo1 
{
	public static void main(String[] args) 
	{
		int [] array= {10,20,30,65,89,657,78,10,20,65,657};
		
			int[] array1=Arrays.stream(array)	
							.distinct()
								.sorted()
									.filter(num->num%2==0)
//									.forEach(n->IO.println(n));
										.toArray();
			IO.println(Arrays.toString(array1));
			
	}
}
