package com.hl.week5.lab3;

public class Doctor extends Person{
	private String specialization;
	private double consultationFee;
	
	public Doctor(int personId, String name, int age, String specialization, double consultationFee) {
		super(personId, name, age);
		this.specialization = specialization;
		this.consultationFee = consultationFee;
	}
	
	public void diagnosePatient() {
		System.out.println(name + " is diagnosing a patient.");
	}
	@Override
	public void performDuties() {
		System.out.println(name + " is providing medical care.");
	}
}
