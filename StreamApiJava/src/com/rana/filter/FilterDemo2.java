package com.rana.filter;

import java.util.Arrays;

/*\
 Retrieve the cities name that start with h character in string array
 */

public class FilterDemo2 {

	public static void main(String[] args) 
	{
		String[]cities= {"Hyderabad","pune","Harayana","ballia","Hitech city"};
		String[] array=Arrays.stream(cities)
			.filter(city->city.startsWith("H"))
				.toArray(String[]::new);//String[]::new is a constructor reference.
		IO.print(Arrays.toString(array));
		

	}

}
