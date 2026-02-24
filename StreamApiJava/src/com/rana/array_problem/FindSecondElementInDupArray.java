package com.rana.array_problem;

import java.util.Arrays;

public class FindSecondElementInDupArray {

	public static void main(String[] args) 
	{
		int []arr= {23,54,67,67,89,34};
		Arrays.stream(arr)
			.distinct()
				.boxed()
					.sorted((a,b)->b.compareTo(a))
						.skip(1)
							.findFirst().ifPresent(IO::println);

	}

}
