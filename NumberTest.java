/**
 * Test class for the number class
 * @author brendonreynolds
 *
 */

import java.util.*;

public class NumberTest 
{
	public static void main(String [] args)
	{
		Scanner kbReader = new Scanner(System.in);
		System.out.print("What is your number? ");
		int number = kbReader.nextInt();
		Number number1 = new Number(number);
		System.out.println("Your number is " + number + ". " + number1.oddOrEven() + "\n" 
							+ number1.isPrime() + number1.factors()); 
	}
}
