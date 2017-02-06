import java.util.*;
import java.io.*;

public class Polynomial {
	private String newton = new String();
	private String[] newtoid;
	private int p = 0;

	public Polynomial(String input, int array_length) {
		newton = input + "+x"; // because of errors
		newtoid = new String[array_length];
		sortPoly();
		System.out.print("Differentiated Polynomial: ");
		calculatePoly();
	}
	
	//Separating into monomials
	public void sortPoly() {
		try {
			int operators = 0;
			int s = 0;
			for (int i = 0; i <= newton.length() - 1; i++) {
				if (newton.charAt(i) == '+' || newton.charAt(i) == '-') {
					operators++;
					if (operators == 1) {
						s = i;
						newtoid[p] = newton.substring(0, i);
					} else {
						newtoid[++p] = newton.substring(s, i);
						s = i;
					}
				}

			}
			//The output for displaying each monomial
			/*for (int i = 0; i < newtoid.length; i++) {
				if (newtoid[i] != null) {
					System.out.print(newtoid[i] + " ");
				}
			}
			*/ 
		} catch (Exception ex) {
			System.out.println("Only constant. Please enter a polynomial.");
		}
	}

	//Differentiation
	public void calculatePoly() {
		String temp = new String("");
		String sign = new String("");
		String derivative = new String();
		String coefficent = new String("");
		String exponent = new String("");
		int coefficent_num = 1;
		int exponent_num = 1;
		try {
			for (int i = 0; i <= p; i++) { //for each monomial

				for (int n = 0; n <= newtoid[i].length() - 1; n++) { 
					//getting sign
					if (newtoid[i].charAt(n) == '+') {
						sign = "+";
					} else if (newtoid[i].charAt(n) == '-') {
						sign = "-";
					} 
					//getting coefficient, exponent, and storing x^
					else if (Character.isDigit(newtoid[i].charAt(n)) && n <= newtoid[i].indexOf('x')) {
						coefficent += newtoid[i].charAt(n);
					} else if (newtoid[i].charAt(n) == 'x') {
						temp += newtoid[i].charAt(n);
					} else if (newtoid[i].charAt(n) == '^') {
						temp += newtoid[i].charAt(n);
					} else if (newtoid[i].charAt(n - 1) == '^' && Character.isDigit(newtoid[i].charAt(n))) {
						exponent += newtoid[i].charAt(n);
					}

				}
				
				if (!exponent.equals("")) {
					exponent_num = Integer.parseInt(exponent);
					coefficent_num = Integer.parseInt(coefficent) * exponent_num;
					exponent_num--;
					derivative = coefficent_num + temp + exponent_num;

				} else { //if there's no exponent, i.e. 9x
					coefficent_num = Integer.parseInt(coefficent);
					derivative = coefficent_num + "";
				}

				//if it's not the first monomial, a sign needs to be printed
				if (i != 0) {
					System.out.print(" " + sign + " " + derivative);
				} else {
					System.out.print(derivative + " ");
				}
				
				//resetting values
				temp = "";
				derivative = "";
				coefficent = "";
				exponent = "";
				sign = "";
			}
		} catch(Exception ex){
			System.out.println("Error.");
		}
	}
}
