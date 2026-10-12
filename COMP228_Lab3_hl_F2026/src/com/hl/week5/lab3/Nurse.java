package com.hl.week5.lab3;

public class Nurse extends Person{
	private String department;
	private String shift;
	
	public Nurse(int personId, String name, int age, String department, String shift) {
		super(personId, name, age);
		this.department = department;
		this.shift = shift;
	}
	
	public void assistPatient() {
		System.out.println(name + " is assisting a patient.");
	}
	@Override
	public void performDuties() {
		System.out.println(name + " is providing nursing care.");
	}
}
