package vamshi;

public class Thrws {
	static void check() throws ArithmeticException
{
	System.out.println("error inside");
	throw new ArithmeticException("demo");
	
}

	public static void main(String aa[])
	{
		try
		{
			check();
		}
		catch(ArithmeticException e)
		{
			System.out.println("caught");
		}
	}
	
}
