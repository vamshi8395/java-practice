import java.io.*;
public class Split 
{
	public static void main(String aaa[])
	{
		String s=new String("i am the danger ");
		System.out.println("Return value :");
		for (String retval: s.split(" "))
		{
			System.out.println(retval);
	}
	}
}
