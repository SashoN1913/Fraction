package edu.school.oop;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int numerator = s.nextInt();
		int denominator = s.nextInt();
		
		Fraction fraction = new Fraction(numerator , denominator);
		
		System.out.println(fraction.toString());
		
		int secondNumerator = s.nextInt();
		int secondDenominator = s.nextInt();
	
		Fraction secondFraction = new Fraction(secondNumerator , secondDenominator);
		
		Fraction sum = fraction.add(secondFraction);
		Fraction substract = fraction.substract(secondFraction);
		Fraction multiply = fraction.multiply(secondFraction);
		Fraction divide = fraction.divide(secondFraction);
		
		
		
		System.out.println("Sum is: " + sum.toString());
		System.out.println("Substract is: " + substract.toString());
		System.out.println("Mulitply is: " + multiply.toString());
		System.out.println("Divide is: " + divide.toString());
		
		s.close();

	}

}
