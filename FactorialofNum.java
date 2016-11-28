package vamshi;

import java.util.Scanner;
public class FactorialofNum {
	public static void main(String[] args)
	{
		
		
		    int n, m = 1;
		    
	        Scanner s = new Scanner(System.in);
	        
	        System.out.print("Enter any integer:");
	        
	        n = s.nextInt();
	        
	        for(int i = 1; i <= n; i++)
	        {
	            m = m * i;
	        }
	        System.out.println("Factorial of "+n+" :"+m);

	}

}

