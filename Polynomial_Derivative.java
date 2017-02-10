import java.util.*;
import java.io.*;
import java.lang.*;

public class Polynomial_Derivative {
	private String newton = new String();
	private String[] newtoid;
	private String[] operators;
	private int p = 0;

	public Polynomial_Derivative(String input) { //constructor
		newton = input + "+x"; //used to avoid errors... Breaks if removed
		newtoid = new String[countPoly()]; //creates a array with elements
		operators = new String[countPoly()];
		sortPoly();
		calculatePoly();
		printDeriv();
	}

	public int countPoly() { //counts how many operators in newton to optimize String element instances
		int occurence = 0;
		for (int i = 0; i < newton.length(); i++) {
			if (newton.charAt(i) == '+' || newton.charAt(i) == '-' || newton.charAt(i) == ' ') {
				occurence++;
			}
		}
		return occurence;
	}

	public void sortPoly() { //divides up newton into parts without operators
		try {
			int signs = 0;
			int s = 0;
			for (int i = 0; i <= newton.length() - 1; i++) {
				if (newton.charAt(i) == '+' || newton.charAt(i) == '-') {
					operators[signs] = Character.toString(newton.charAt(i));
					signs++;
					if (signs == 1) {
						s = i;
						newtoid[p] = newton.substring(0, i);
					} else {
						newtoid[++p] = newton.substring(s + 1, i);
						s = i;
					}
				}

			}
		} catch (Exception ex) {
			System.out.println("information not entered correctly");
		}
	}

	public void calculatePoly() { //applies calculus rule by checking which elements have certain properties
		String temp = new String("");
		String derivative = new String("");
		String coefficent = new String("");
		String exponent = new String("");
		int coefficent_num = 1;
		int exponent_num = 1;
		try {
			for (int i = 0; i <= p; i++) {

				for (int n = 0; n <= newtoid[i].length() - 1; n++) {
					if (Character.isDigit(newtoid[i].charAt(n)) && n <= newtoid[i].indexOf('x')) {
						coefficent += newtoid[i].charAt(n);
					} else if (newtoid[i].charAt(n) == 'x') {
						temp += newtoid[i].charAt(n);
					} else if (newtoid[i].charAt(n) == '^') {
						temp += newtoid[i].charAt(n);
					} else if (n >= newtoid[i].indexOf('^') && Character.isDigit(newtoid[i].charAt(n))
							&& newtoid[i].indexOf('^') > 0) {
						exponent += newtoid[i].charAt(n);
					} else {
						coefficent += newtoid[i].charAt(n);
					}

				}
				if (!exponent.equals("")) {
					exponent_num = Integer.parseInt(exponent);
					coefficent_num = Integer.parseInt(coefficent) * exponent_num;
					exponent_num--;
					derivative = coefficent_num + temp + exponent_num;
					newtoid[i] = derivative;

				} else if (newtoid[i].indexOf('x') > 0) {
					coefficent_num = Integer.parseInt(coefficent);
					derivative += coefficent_num;
					newtoid[i] = derivative;
				} else {
					derivative = "0";
					newtoid[i] = derivative;
				}
				temp = "";
				derivative = "";
				coefficent = "";
				exponent = "";
			}
		} catch (Exception ex) {
			System.out.println("error");
		}
	}

	public void printDeriv() { //combines the calculated elements with the operators to make final string
		System.out.print("Derivative: ");
		for (int i = 0; i < newtoid.length; i++) {
			System.out.print(newtoid[i]);
			System.out.print(operators[i]);
		}
		System.out.print("0\n");
	}
}