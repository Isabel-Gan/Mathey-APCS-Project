/*
 *Author: Nick Brooks (All Original)
 *Date: 2/6/17
 *School: Hendersonville High School
 *Description: This program uses String based logic to calculate Derivate
 *Advantages of Other Calculators: Returns a string that has all operators and is not a value. Really convenient when you compare it to
 *the ones on github.
*/

import java.util.*;

public class Polynomial_test {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Polynomial: ");
		String text = sc.next();
		Polynomial_Derivative p1 = new Polynomial_Derivative(text);
		Polynomial_Integration i1 = new Polynomial_Integration(text);
	}
}
/*
Enter Polynomial: 
8x^2+10x+10
Derivative: 16x^1+10+0+0
Integration: (8/3)x^3+(10/2)x^2+10x+0

Enter Polynomial: 
9x^5+7x+8x-5+50x+10
Derivative: 45x^4+7+8-0+50+0+0
Integration: (9/6)x^6+(7/2)x^2+(8/2)x^2-5x+(50/2)x^2+10x+0

Enter Polynomial: 
8x^2+10x+10-5x^2
Derivative: 16x^1+10+0-10x^1+0
Integration: (8/3)x^3+(10/2)x^2+10x-(5/3)x^3+0
*/