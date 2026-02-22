package com.rana.map;

import java.util.Arrays;

//Wap to find the cube of all even number of the arrays

public class MapDemo3 {

	public static void main(String[] args) 
	{
		int []arr= {12,32,23,45,68,90,65,13};
		int[] array=Arrays.stream(arr)
			.filter(n->n%2==0)
				.map(n->n*n*n)
					.toArray();
//					.forEach(IO::println);
		IO.println("Cube of the array "+Arrays.toString(array));
				
	}

}
