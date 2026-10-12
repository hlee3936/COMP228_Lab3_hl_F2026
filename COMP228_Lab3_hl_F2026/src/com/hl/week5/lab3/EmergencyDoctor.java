package com.hl.week5.lab3;

public class EmergencyDoctor extends Doctor implements MedicalProfessional, Billable {
	public EmergencyDoctor(int personId, String name, int age, String specialization, double consultationFee) {
		super(personId, name, age, specialization, consultationFee);
	}
	public void handleEmergency() {
		System.out.println(name + " is handling a medical emergency.");
	}
	@Override
	public void prescribeMedication() {
		System.out.println(name + " is prescribing medication.");
	}
	@Override
	public void generateBill() {
		System.out.println(name + " generated an emergency treatment bill.");
	}
	@Override
	public void performDuties() {
		System.out.println(name + " is providing emergency medical care.");
	}
	
}
