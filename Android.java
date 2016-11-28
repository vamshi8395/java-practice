	import java.util.Scanner;
public class Android 
{
 
	public static void main(String aa[])
	{	
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter your option :");
	int opt=s.nextInt();
	switch (opt)
	{
	case 0:
	{
		System.out.println("sunday");
		break;
	}
	case 1:
	{
		System.out.println("monday");
		break;
	}
	case 2:
	{
		System.out.println("tuesday");
		break;
	}
	case 3:
	{
		System.out.println("wednes");
		break;
	}
	default :
	{System.out.println("value should be bw 0-3");
	break;
		
	}
	}
	
	}
	}
	


