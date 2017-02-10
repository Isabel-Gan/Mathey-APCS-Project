/**
 * This is a class to find a few properties of a number 
 * @author brendonreynolds
 *
 */

public class Number 
{
	//declare variables 
	private int number;
	String property;
	String prime;
	String factors = ("The factors of your number are: ");
	
	//constructor for the number object
	public Number(int a)
	{
		number = a; 
	}
	
	//This method finds if the number is odd or even
	public String oddOrEven()
	{
		if(number % 2 == 0)
			property = "The number " + number + " is even. ";
		else
			property = "The number " + number + " is odd. ";
		
		return property; 
	}
	
	//This method returns if the number is a prime number
	public String isPrime()
	{
		for(int i=2;i<number;i++) 
        	{
            		if(number%i==0)
            		{
            		prime = "The number is not a prime number. ";
            		break;
            		}
            	else
            		prime = "The number is a prime number. ";
        	}
        	return prime;
	}
	
	//This method finds the factors of the number
	public String factors()
	{ 
		for(int b = 1; b <= number; b++)
		{
			if(number % b == 0)
				factors += b + " ";
		}
		return factors;
	}
}
