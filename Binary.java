package vamshi;
import java.util.Scanner;
public class Binary {
	static void isBinaryOrNot(int number)
    {
        boolean isBinary = true;
 
        int copyOfNumber = number;
 
        while (copyOfNumber != 0)
        {
            int temp = copyOfNumber%10;   
            if(temp > 1)
            {
                isBinary = false;
                break;
            }
            else
            {
                copyOfNumber = copyOfNumber/10;   
            }
        }
 
        if (isBinary)
        {
            System.out.println(number+" is a binary number");
        }
        else
        {
            System.out.println(number+" is not a binary number");
        }
    }
public static void main(String aa[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter your number");
	int a=s.nextInt();
	isBinaryOrNot(a);
}
}
