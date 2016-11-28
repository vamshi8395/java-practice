package vamshi;
import java.util.Scanner;
public class Sumofeachdigit {
public static void main(String aa[])
{
	Scanner s=new Scanner(System.in);
	 int a;
	 System.out.println("enter your number");
     a = s.nextInt();
     if (a <= 0)
           System.out.println("you have entered invalid number");
     else {
           int sum = 0;
           while (a != 0) 
           {
                 
                 sum += a % 10;
                 
                 a /= 10;
           }
           System.out.println("Sum of digits: " + sum);
     }
	    
      
     
}
}