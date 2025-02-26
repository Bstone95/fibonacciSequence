/*Bradley Stone
 * COSC 1174
 * Dr. Makki
 * 03/23/2023
 */


/* We utilize code from the book to describe the amount of times a recursive
 * function is called to visualize the process more effectively
 */
import java.util.Scanner;
public class Fib {
			/** Main method */
			public static void main(String[] args) {
				// Create a Scanner
				Scanner input = new Scanner(System.in);
				System.out.print("Enter an index for a Fibonacci number: ");
				int index = input.nextInt();

				// Find and display the Fibonacci number
				System.out.println("The Fibonacci number at index " 
					+ index + " is " + fib(index));
				
				//Print line to show amount of times recursion was called//
				System.out.println("The fib method was called " +
					count + (count !=1 ? " times." : " time."));

	}


/** The method for finding the Fibonacci number */
//integer used to increment in the method and count amount of recursion calls//
public static int count = 0;
public static long fib(long index) {
	count++; //increments counts with each recursion//
	if(index == 0) { // base case//
		return 0;
}
else if (index == 1) { //base case//
	return 1;
}
	else //reduction and recursive calls//
		
		return fib(index-1) + fib(index-2);
}
}
