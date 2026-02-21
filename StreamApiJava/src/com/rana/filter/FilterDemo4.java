package com.rana.filter;

import java.util.Arrays;

public class FilterDemo4 {

	public static void main(String[] args) 
	{
		String[]names= {"Rana","Pratap","Yadav","Rahul","Raj","Deepak","Rana","Pratap","Yadav","Rahul","Raj","Deepak"};
		Arrays.stream(names)
					.distinct()
						.sorted((s1,s2)->s2.compareTo(s1))
							.filter(name->name.length()>3)
								.forEach(n->IO.println(n));
	}

}
