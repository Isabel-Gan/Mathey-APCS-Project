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
		calculatePoly();
	}

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
						newtoid[++p] = newton.substring(s + 1, i);
						s = i;
					}
				}

			}
			System.out.println(newtoid[0] + " " + newtoid[1] + " " + newtoid[2] + " " + newtoid[3]);
		} catch (Exception ex) {
			System.out.println("only constant");
		}
	}

	/*
	 * //Character.getNumericValue(newtoid[i].charAt(n));\
	 * Character.getNumericValue(newtoid[i].charAt(n)); && newtoid[i].charAt(n)
	 * <= newtoid[i].indexOf(temp)
	 */
	public void calculatePoly() {
		String temp = new String("");
		String derivative = new String();
		String coefficent = new String("");
		String exponent = new String("");
		int coefficent_num = 1;
		int exponent_num = 1;
		try{
		for (int i = 0; i <= p; i++) {

			for (int n = 0; n <= newtoid[i].length() - 1; n++) {
				if (Character.isDigit(newtoid[i].charAt(n)) && n <= newtoid[i].indexOf('x')) {
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

			} else {
				coefficent_num = Integer.parseInt(coefficent);
				derivative = coefficent_num + temp;
			}

			System.out.println(derivative);
			temp = "";
			derivative = "";
			coefficent = "";
			exponent = "";
		}
		}catch(Exception ex){
			System.out.println("error");
		}
	}
}