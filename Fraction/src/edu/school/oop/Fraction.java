package edu.school.oop;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public int getNumerator()
	{
		
		return numerator;
		
	}
	
	public int getDenominator()
	{
		
		return denominator;
		
	}
	
	public Fraction(int numeratorValue , int denominatorValue)
	{
		
		numerator = numeratorValue;
		if(denominatorValue != 0)
		{
			
			denominator = denominatorValue;
			
		}
		
	}
	
	public Fraction()
	{
		
		numerator = 0;
		denominator = 1;
		
	}
	
	public Fraction(int numeratorValue)
	{
		
		numerator = numeratorValue;
		denominator = 1;
		
	}
	
	public int setNumerator(int numeratorValue)
	{
		
		numerator = numeratorValue;
		return numerator;
		
	}
	
	public int setDenominator(int denominatorValue)
	{
		
		denominator = denominatorValue;
		return denominator;
		
	}
	
	public String toString()
	{
		
		String output = getNumerator() + " / " + getDenominator();
		return output;
		
	}
	
	public Fraction add(Fraction f)
	{
		
		Fraction sum = new Fraction(f.getDenominator() * numerator + f.getNumerator() * denominator , denominator * f.getDenominator());
		return sum;
		
	}
	
	public Fraction substract(Fraction f)
	{
		
		Fraction sum = new Fraction(f.getDenominator() * numerator - f.getNumerator() * denominator , denominator * f.getDenominator());
		return sum;
		
	}
	
	public Fraction multiply(Fraction f)
	{
		
		Fraction sum = new Fraction(f.getNumerator() * numerator  , denominator * f.getDenominator());
		return sum;
		
	}
	
	public Fraction divide(Fraction f)
	{
		
		Fraction sum = new Fraction(f.getNumerator() * denominator  , numerator * f.getDenominator());
		return sum;
		
	}
	
	public void simplify()
	{
		
		int numeratorValue = numerator;
		int denominatorValue = denominator;
		
		while(numeratorValue != 0 && denominatorValue != 0)
		{
			
			if(numeratorValue > denominatorValue)
			{
				
				numeratorValue = numeratorValue - denominatorValue;
				
			}
			else
			{
				
				denominatorValue = denominatorValue - numeratorValue;
				
			}
			
			int gcd = denominatorValue + numeratorValue;
			numerator /= gcd;
			denominator /= gcd;
			
		}
		
	}
	
	
}
