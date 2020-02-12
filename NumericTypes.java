import java.util.Scanner;

/**
   This program demonstrates how numeric types and operators behave in Java
*/
public class NumericTypes {
	public static void main (String [] args) {
		
		final int NUMBER = 2; 
		int score1; 
		int score2; 
		int BOILING_IN_F;
		Scanner input = new Scanner(System.in);
		double fToC; 
		double average;
		String output; 
		   System.out.println("enter score1: ");
		        score1=input.nextInt();
		   System.out.println("enter score2: ");
		        score2=input.nextInt();
		   System.out.println("enter Temprature in farenheit: ");
		        BOILING_IN_F=input.nextInt();
		
		   average = (score1 + score2) / NUMBER;
		   output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		   fToC = (5 * (BOILING_IN_F - 32))/9;
		   output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		
		System.out.println("Goodbye"); 
	}
}