package com.rana.optional_demo;

import java.util.Optional;

public class OptionalDemo4 {

	public static void main(String[] args) 
	{
		Integer val=null;
		Optional<Integer>num=Optional.ofNullable(val);
		Integer orElse = num.orElse(-1);
		System.out.println(orElse);
		
//		String name=null;
		String name="Rana pRatap Yadav";
		Optional<String> conatiner=Optional.ofNullable(name);
		conatiner.ifPresent(IO::println);

	}

}
