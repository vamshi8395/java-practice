package vamshi;

import java.util.Random.*;
import java.math.*;
public class Random {
	



		public static void main(String[] args)
		{
			int counter;
			
		      Random rnum = new Random();
		      
		      
		      System.out.println("Random Numbers:");
		      

		      for (counter = 1; counter <= 5; counter++) 
		      {
		         System.out.println(rnum.nextInt(200));
		      }

		}

	}

