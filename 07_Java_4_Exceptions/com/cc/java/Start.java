package com.cc.java;

public class Start {

	public static void main(String[] args) {
		
		String str;  // String
		char ch; // Character
		
		try 
		{		
			str = "Irgend eine Zeichenkette";
			System.out.println("Stringl�nge :" + str.length());
			
			ch = str.charAt(200);
			System.out.println("Character :" + ch);	
		} 
		catch (StringIndexOutOfBoundsException e) {
			// Fehlerbehandlung ...
			System.out.println("Index Fehler, bitte Eingabe pr�fen!");		
		}
		catch (Exception e) {
			// Weitere Fehler-Routinen ....
		}
		
		
	}

}
