package vamshi;

import java.util.Scanner;
public class Secondhighest
{
	
	public static void main(String aa[])
	{
		Scanner s=new Scanner(System.in);
         System.out.println("Enter Array Size :");
         int size=s.nextInt();
         int arr[]=new int[size];//12 34 56 78
         for(int i=0;i<arr.length;i++)
         {
        	 arr[i]=s.nextInt();
         }
         int f=0,se=0;
         for(int j:arr)
         {
        	 if(f<j)
        	 {
        		se=f;
        		f=j;
        	 }
        	 else if(se>f)
        	 {
        		 se=f;
        	 }
         }
         //System.out.println(f);
         System.out.println("Second Highest value is"+se);
	}
}
