package com.hl.week5.lab3;

import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("-----DOCTOR-----");
        System.out.print("Person ID: "); 
        int dId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: "); 
        String dName = scanner.nextLine();
        System.out.print("Age: "); 
        int dAge = scanner.nextInt(); 
        scanner.nextLine();
        System.out.print("Specialization: "); 
        String dSpec = scanner.nextLine();
        System.out.print("Consultation Fee: "); 
        double dFee = scanner.nextDouble(); 
        scanner.nextLine();

        Doctor doctor = new Doctor(dId, dName, dAge, dSpec, dFee);
        doctor.performDuties();
        doctor.diagnosePatient();
        
        
        System.out.println("\n-----NURSE-----");
        System.out.print("Person ID: "); 
        int nId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: "); 
        String nName = scanner.nextLine();
        System.out.print("Age: "); 
        int nAge = scanner.nextInt(); 
        scanner.nextLine();
        System.out.print("Department: "); 
        String nDept = scanner.nextLine();
        System.out.print("Shift: "); 
        String nShift = scanner.nextLine();

        Nurse nurse = new Nurse(nId, nName, nAge, nDept, nShift);
        nurse.performDuties();
        nurse.assistPatient();
        
        
        System.out.println("\n-----SURGEON-----");
        System.out.print("Person ID: "); 
        int sId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: "); 
        String sName = scanner.nextLine();
        System.out.print("Age: "); 
        int sAge = scanner.nextInt(); 
        scanner.nextLine();
        System.out.print("Specialization: "); 
        String sSpec = scanner.nextLine();
        System.out.print("Consultation Fee: "); 
        double sFee = scanner.nextDouble(); 
        scanner.nextLine();
        System.out.print("Surgery Type: "); 
        String sType = scanner.nextLine();
        System.out.print("Operating Room: "); 
        String sRoom = scanner.nextLine();

        Surgeon surgeon = new Surgeon(sId, sName, sAge, sSpec, sFee, sType, sRoom);
        surgeon.performDuties();
        surgeon.diagnosePatient();
        surgeon.performSurgery();


        System.out.println("\n-----EMERGENCY DOCTOR-----");
        System.out.print("Person ID: "); 
        int eId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: "); 
        String eName = scanner.nextLine();
        System.out.print("Age: "); 
        int eAge = scanner.nextInt(); 
        scanner.nextLine();
        System.out.print("Specialization: "); 
        String eSpec = scanner.nextLine();
        System.out.print("Consultation Fee: "); 
        double eFee = scanner.nextDouble(); 
        scanner.nextLine();

        EmergencyDoctor emDoc = new EmergencyDoctor(eId, eName, eAge, eSpec, eFee);
        emDoc.performDuties();
        emDoc.handleEmergency();
        emDoc.prescribeMedication();
        emDoc.generateBill();
        
        
        System.out.println("\n-----POLYMORPHISM-----");
        Person person;

        person = new Doctor(dId, dName, dAge, dSpec, dFee);
        person.performDuties();

        person = new Nurse(nId, nName, nAge, nDept, nShift);
        person.performDuties();

        person = new Surgeon(sId, sName, sAge, sSpec, sFee, sType, sRoom);
        person.performDuties();

        person = new EmergencyDoctor(eId, eName, eAge, eSpec, eFee);
        person.performDuties();
	}
}
