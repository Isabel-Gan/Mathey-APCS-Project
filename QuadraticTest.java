import java.util.*;

public class QuadraticTest 
{
	public static void main(String [] args)
	{
		String again;
		Scanner kbReader = new Scanner(System.in);
		
		//allows the user to do more than one polynomial
		do
		{
			Quadratic poly1 = new Quadratic();
			System.out.println(poly1.quadraticFormula());
			System.out.println("");
			System.out.print("Would you like to do another polynomial? ");
			again = kbReader.nextLine();
			System.out.println("");
		}
		while(again.equalsIgnoreCase("yes"));
	}
}
