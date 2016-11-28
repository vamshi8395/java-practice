import java.util.Scanner;


public class Switch 
{
public static void main(String aa[])
{

	Scanner s=new Scanner(System.in);
	System.out.println("enter your day :");
	String day=s.next();
	switch(day)
	
	
	
	{
		case "mon":
		{
		System.out.println("blue");
		break;
        }
	
	case "tue":
	{
		System.out.println("green");
		break;
}
	
	case "wed":
	{
		System.out.println("yellow");
		break;
}
	
	case "thu":
	{	System.out.println("red");
		break;
}
	
	case "fri":
	{
		System.out.println("orange");
		break;
}
	
		case "sat":
		{
			System.out.println("black");
		break;
}
	
		case "sun":
	 {	
	System.out.println("white");
		break;
}
		default:
		 {	
		System.out.println("invalid");
			break;
	}
	}
	
}
}
