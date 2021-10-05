package edu.wit.cs.comp1000;
/**
 * Example solution to Problem a(PA1a.java)
 * 
 * @author Hector Padilla 
 * @date 9/18/19 
 */
import java.util.Scanner;
// TODO: document this class
public class PA1a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		/*Enter number of yards: 1
		Enter number of feet: 2
		Enter number of inches: 3
		Total number of inches: 63
		*/
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter number of yards: ");
		int yards = scnr.nextInt();
				
		System.out.print("Enter number of feet: ");
		int feet = scnr.nextInt();
		
		System.out.print("Enter number of inches: ");
		int inches = scnr.nextInt();

		int total = (yards * 36) + (feet * 12) + (inches);
		System.out.println("Total number of inches: " + total);
		
	}

}
