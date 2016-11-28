package vamshi;

public class Aobe
{
public static void main(String aa[])
{
	int array[]={15,40,55};
	int a=32;
	int b=16;
	int c;
	try
	{
		c=a/b;
		System.out.println("c value is" + c);
		for(int i =10;i >=0; i--)
			System.out.println("the vale of array is" +array[i]);	
	}


catch (ArrayIndexOutOfBoundsException e)
{
	System.out.println("array out of bounds" +e);
	
	
}
catch (ArithmeticException e)
{
	System.out.println("cant div by zero " +e);
}
}
}

