import java.util.*;
import java.io.*;
import java.lang.*;

public class Polynomial_Integration {
	private String newton = new String();
	private String[] leibnoid;
	private String[] operators;
	private int p = 0;

	public Polynomial_Integration(String input) { //constructor
		newton = input + "+x";
		leibnoid = new String[countPoly()];
		operators = new String[countPoly()];
		sortPoly();
		calculatePoly();
		printInteg();
	}

	public int countPoly() {
		int occurence = 0;
		for (int i = 0; i < newton.length(); i++) {
			if (newton.charAt(i) == '+' || newton.charAt(i) == '-' || newton.charAt(i) == ' ') {
				occurence++;
			}
		}
		return occurence;
	}

	public void sortPoly() {
		try {
			int signs = 0;
			int s = 0;
			for (int i = 0; i <= newton.length() - 1; i++) {
				if (newton.charAt(i) == '+' || newton.charAt(i) == '-') {
					operators[signs] = Character.toString(newton.charAt(i));
					signs++;
					if (signs == 1) {
						s = i;
						leibnoid[p] = newton.substring(0, i);
					} else {
						leibnoid[++p] = newton.substring(s + 1, i);
						s = i;
					}
				}

			}
		} catch (Exception ex) {
			System.out.println("error");
		}
	}

	public void calculatePoly() { //applies integration rule for polynomials
		String temp = new String("");
		String integrate = new String("");
		String coefficent = new String("");
		String exponent = new String("");
		int coefficent_num = 1;
		int exponent_num = 1;
		try {
			for (int i = 0; i <= p; i++) {

				for (int n = 0; n <= leibnoid[i].length() - 1; n++) {
					if (Character.isDigit(leibnoid[i].charAt(n)) && n <= leibnoid[i].indexOf('x')) {
						coefficent += leibnoid[i].charAt(n);
					} else if (leibnoid[i].charAt(n) == 'x') {
						temp += leibnoid[i].charAt(n);
					} else if (leibnoid[i].charAt(n) == '^') {
						temp += leibnoid[i].charAt(n);
					} else if (leibnoid[i].indexOf('^') >= 0 && Character.isDigit(leibnoid[i].charAt(n))) {
						exponent += leibnoid[i].charAt(n);
					}else{
						coefficent += leibnoid[i].charAt(n);
					}

				}
				if (!exponent.equals("")) {
					exponent_num = Integer.parseInt(exponent);
					coefficent_num = Integer.parseInt(coefficent);
					exponent_num++;
					integrate = "(" + coefficent_num + "/" + exponent_num + ")" + temp + exponent_num;
					leibnoid[i] = integrate;

				}
				else if(!temp.equals("")) {
					coefficent_num = Integer.parseInt(coefficent);
					integrate += "(" + coefficent_num + "/" + "2" + ")" + temp + "^2";
					leibnoid[i] = integrate;
				}else{
					integrate = coefficent + "x";
					leibnoid[i] = integrate;
					
				}
				temp = "";
				integrate = "";
				coefficent = "";
				exponent = "";
			}
		} catch (Exception ex) {
			System.out.println("error");
		}
	}

	public void printInteg() {
		System.out.print("Integration: ");
		for (int i = 0; i < leibnoid.length; i++) {
			System.out.print(leibnoid[i]);
			System.out.print(operators[i]);
		}
		System.out.print("0\n");
	}
}