package com.cc.java;

import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {
		
		// Vorüberlegung
		
		//Cat cat = new Cat("Grizabella");
		//ausgabe(cat.getAttributes());
		//cat1 / cat2 .. more of the same ...DRY
		
		/*
		for (int i = 0; i < 10; i++) 
		{
			new Cat("someone_" + i); // Objekt, aber KEINE Referenz!
		}
		*/
		
		//int numOfCats = 4;
		ArrayList<Cat> objList = new ArrayList<>();
		String [] nameArr = {"Grizabella","Alonzo", "RumTumTugger","Suzanne"};
		
		for (int i = 0; i < nameArr.length; i++) 
		{
			objList.add(new Cat(nameArr[i]));
		}
		
		ausgabe("Cats: " + objList);
		ausgabe(objList.get(0).getAttributes());
		ausgabe(objList.get(1).getAttributes());
		ausgabe(objList.get(objList.size()-1).getAttributes());
		
	}
	
	public static void ausgabe(String outStr) {
		System.out.println(outStr);
	}

}
