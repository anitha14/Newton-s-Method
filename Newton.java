/**
 * Newton.java - Calculates the square root of a number with Newton's Method.
 * CMSY166 Fall 2022
 * @author Anitha Tumarada
 * @version 1.1
 */

import java.util.Scanner;
public class Newton {

	public static void main(String[] args) {
		System.out.println("Copyright 2022 Howard Community College"); //Copyright message
		System.out.println();
		
		//Declare and instantiate a scanner object
		Scanner input = new Scanner(System.in);
		
		//Declare an integer variable for the starting integer number, S to find the squareroot
		int s = 0;
		System.out.print("Enter an integer, S: ");
		
		s= input.nextInt();
		
		//if-statement condition if the user input of S is less than 0
	
		if(s < 0) {
			System.out.println("This program cannot take the square root of a negative number");

		}
		
		
		//if statement condition if the user input is greater than 400
		if(s < 20 && s > 400) {
			System.out.println("This value is out of range");

		}
		else 
		{
					System.out.printf("The square root of "+s);

		}
		//declare a double variable to store the calculation of one-half of the user-input S
		double initial_value = 0;
		initial_value = (0.5 * s);
		
		//declare a double variable to store the general formula for the 9 values
	
		double firstval = 0;
		firstval = (0.5 * (initial_value + s/initial_value));
		
		double secondval = 0;
		secondval = (0.5 * (firstval + s/firstval)); //formula modified to replace the initial value variable
		
		double thirdval = 0;
		thirdval = (0.5 * (secondval + s/secondval));
		
		double fourthval = 0;
		fourthval = (0.5 * (thirdval + s/thirdval));
		
		double fifthval = 0;
		fifthval = (0.5 * (fourthval + s/fourthval));
		
		double sixthval = 0;
		sixthval = (0.5 * (fifthval + s/fifthval));
		
		double seventhval = 0;
		seventhval = (0.5 * (sixthval + s/sixthval));
		
		double eighthval = 0;
		eighthval = (0.5 * (seventhval + s/seventhval));
		
		double ninthval = 0;
		ninthval = (0.5 * (eighthval + s/eighthval));
		
		double x = 0; // x variable declared to display the values of the calculations

		while (x < 10) {
			x++;
		//Print and display the values
		
		System.out.println("S = " +s );
		System.out.printf("x0 = %.4f%n",initial_value);
		System.out.printf("x1 = %.4f%n",firstval);
		System.out.printf("x2 = %.4f%n" ,secondval);
		System.out.printf("x3 = %.4f%n" ,thirdval);
		System.out.printf("x4 = %.4f%n" ,fourthval);
		System.out.printf("x5 = %.4f%n" ,fifthval);
		System.out.printf("x6 = %.4f%n" ,sixthval);
		System.out.printf("x7 = %.4f%n" ,seventhval);
		System.out.printf("x8 = %.4f%n" ,eighthval);
		System.out.printf("x9 = %.4f%n" ,ninthval);
		}
		
		
	} //End of main

} //End of Newton class
