package com.rana.optional_demo;

import java.util.Optional;

public class OptionalDemo2 
{
	public static void main(String[] args) 
	{
		Integer val=null;
		Optional<Integer>optional=Optional.of(val);
		
		if(optional.isPresent())
		{
			System.out.println(optional.get());
		}
		else {
			System.err.println("NO value present.");
		}
	}
}
