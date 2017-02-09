import java.util.*;

public class quadraticTest 
{
	public static void main(String [] args)
	{
		String again;
		Scanner kbReader = new Scanner(System.in);
		do
		{
			quadratic poly1 = new quadratic();
			System.out.println(poly1.quadraticFormula());
			System.out.println("");
			System.out.print("Would you like to do another polynomial? ");
			again = kbReader.nextLine();
			System.out.println("");
		}
		while(again.equalsIgnoreCase("yes"));
	}
}
