package com.hl.week5.lab3;

public class Person {
	protected int personId;
	protected String name;
	protected int age;
	
	public Person(int personId, String name, int age) {
		super();
		this.personId = personId;
		this.name = name;
		this.age = age;
	}
	
	public void performDuties() {
		System.out.println(name + " is performing hospital duties.");
	}
}
