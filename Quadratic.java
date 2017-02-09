/**
 * This class is used to find the roots of a polynomial using the quadratic formula
 * @author brendonreynolds
 *
 */

import java.util.*;

public class Quadratic 
{
	//declare variables 
	private int a, b, c;
	double root1, root2;
	Scanner kbReader = new Scanner(System.in);
	String roots;
	
	//constructor; when the object is created it will give the user the chance to enter in a,b,c.
	public Quadratic()
	{
		System.out.println("For a polynomial in the form: ax^2 + bx + c. \nIf the number is not there just enter 0");
		System.out.print("a = ");
		a = kbReader.nextInt();
		System.out.print("b = ");
		b = kbReader.nextInt();
		System.out.print("c = ");
		c = kbReader.nextInt();
	}
	
	//method used to find the roots of the given polynomial
	public String quadraticFormula()
	{
		//Prints out there are no solutions if the polynomial doesn't have any real numbers as a solution.
		if((b*b) - (4*a*c) < 0)
		{
			roots = "There are no real solutions";
			
		}
		else
		{
			root1 = (-b + Math.sqrt((b*b) - (4*a*c)))/(2*a);
			root2 = (-b - Math.sqrt((b*b) - (4*a*c)))/(2*a);
			//round the roots to the thousandth place
			root1 = Math.round(root1 * 1000.0) / 1000.0;
			root2 = Math.round(root2 * 1000.0) / 1000.0;
			
			//Separate the return for a polynomial with 1 solution and a polynomial with 2 solutions
			if(root1 == root2)
			{
				roots = "This polynomial has one root at " + root1;
			}
			else
			{
				roots = "The roots of this polynomial are: " + root1 + " and " + root2;
			}
		}
		return roots;
	}
}
