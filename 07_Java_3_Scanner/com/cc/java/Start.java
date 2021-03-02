package com.cc.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		
		String userName;
		int userAge;

		// Objekt --> input (open)
		Scanner inputObj = new Scanner(System.in);
		
		// Name
		System.out.println("Bitte Benutzernamen eingeben:");
		userName = inputObj.nextLine();
		System.out.println("Benutzername: " + userName);
		
		try {
			
			// Alter
			System.out.println("Bitte Alter eingeben:");
			userAge = inputObj.nextInt();
			System.out.println("Mein Alter ist: " + userAge);	
		
		} catch (InputMismatchException e) {
			
			System.out.println("Bitte eine Zahl eingeben:");
			
		}
		
		// input close
		inputObj.close();

	}

}
