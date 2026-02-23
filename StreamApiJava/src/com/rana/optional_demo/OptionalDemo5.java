package com.rana.optional_demo;

import java.util.Optional;

class Employee
{
	private Integer id;
	private String name;
	public Employee()
	{
		this.id=null;
		this.name=null;
	}
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//Different style of get method  Using Optional class 
	
	public Optional<Integer> getId()
	
	{
		return Optional.ofNullable(this.id);
	}
	
	public Optional<String> getName()
	{
		return Optional.ofNullable(this.name);
	}
	
}

public class OptionalDemo5 {

	

	public static void main(String[] args) 
	{
		Employee emp=new Employee();
		emp=new Employee(111, "Rana Pratap Yadav");
		Optional<Integer> id=emp.getId();
		System.out.println(id.orElse(-1));
		
		Optional<String> name=emp.getName();
		name.ifPresent(IO::println);

	}

}
