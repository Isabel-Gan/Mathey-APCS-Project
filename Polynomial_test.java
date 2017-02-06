import java.util.*;

public class Polynomial_test {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Polynomial: ");
		String text = sc.next();
		int length = text.length() - 1;
		Polynomial p1 = new Polynomial(text, length);
	}
}
