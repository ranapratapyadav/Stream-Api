package com.rana.optional_demo;

import java.util.Optional;

public class OptionalDemo3 
{
	public static void main(String[] args) 
	{
//		String str=null;
//		Optional<String> value=Optional.ofNullable(str);
//		System.out.println(value.get());
		
		
		String str="Rana Pratap Yadav";
		Optional<String> value=Optional.ofNullable(str);
		System.out.println(value.get());
	}
}
