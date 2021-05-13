package com.buzzfreeze.helloworld;

public class HelloWorld {
	public static void main (String [] args) {
		float toInt = 3.14f;
		int newInt = (int)toInt;
		System.out.println(newInt);
		int toFloat = 3;
		
		float newFloat = toFloat;
		System.out.println(newFloat);
		
		double toFloat2 = 33;
		float newFloat2 = (float)toFloat2;
		System.out.println(newFloat2);
		
		char toInt2 = '2';
		int newInt2 = (int)toInt2;
		System.out.println(newInt2);
		
		
		
		bark();
		
	}
	
	public static void bark () {
		String name = "barky";
		
		System.out.println("The Dog name = " + name + " barl" );
		
		
		
	}
	
}
