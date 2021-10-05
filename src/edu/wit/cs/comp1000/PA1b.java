package edu.wit.cs.comp1000;

/**
 * Example Solution to Problem b(Pa1b.java)
 * 
 * @author Hector Padilla
 * @date 9/18/19
 */
import java.util.Scanner;
// TODO: document this class
public class PA1b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		/*Enter number of inches: 50
		Yards: 1
		Feet: 1
		Inches: 2
		*/
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter number of inches: ");
		int inches = scnr.nextInt();
		int Yards = inches/36;
		inches = inches%36;
		int Feet = inches/12;
		inches = inches%12;
		
	
				
		System.out.println("Yards: " + Yards);
	
		
		System.out.println("Feet: " + Feet);


		System.out.println("Inches: " + inches);
		
	}

}
