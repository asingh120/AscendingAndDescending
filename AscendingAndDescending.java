/*  Exercise 2 page 277
	
	Filename: AscendingAndDescending.java
	Author: Amit
	Date: 8/5/19

	Application which sorts three entered integers in ascending and descending order */

import java.util.Scanner;

public class AscendingAndDescending
{
	public static void main(String[] args)
	{
		// Variables and Constants
		int a;
		int b;
		int c;


		//Input phase
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Please enter an integer >> ");
		a = keyboard.nextInt();
		System.out.println("Please enter a second integer >> ");
		b = keyboard.nextInt();
		System.out.println("Please enter a third integer >> ");
		c = keyboard.nextInt();

		// Calculation phase and Output Phase
		if (a < b && a < c && b > c)
		{
			System.out.println("The integers in ascending order are :" + a + " : " + c + " : " + b);
			System.out.println("The integers in descending order are :" + b + " : " + c + " : " + a);
		
		} else if (a < b && a > c && c > b)
		 {
		 	System.out.println("The integers in ascending order are :" + b + " : " + a + " : " + c);
			System.out.println("The integers in descending order are :" + c + " : " + a + " : " + b);	
		 	
		 } else if (a > b && a > c && c > b)
		 {
		 	System.out.println("The integers in ascending order are :" + b + " : " + c + " : " + a);
			System.out.println("The integers in descending order are :" + a + " : " + c + " : " + b);

		 } else if (a < b && b < c)
		 {
		 	System.out.println("The integers in ascending order are :" + a + " : " + b + " : " + c);
			System.out.println("The integers in descending order are :" + c + " : " + b + " : "+ a);
		 } else if (c < a && a < b)
		 {
		 	System.out.println("The integers in ascending order are :" + c + " : " + a + " : " + b);
			System.out.println("The integers in descending order are :" + b + " : " + a + " : "+ c);
		 } else if (c < a && a > b)
		 {
		 	System.out.println("The integers in ascending order are :" + c + " : " + b + " : " + a);
			System.out.println("The integers in descending order are :" + a + " : " + b + " : "+ c);
		 }

	}
}