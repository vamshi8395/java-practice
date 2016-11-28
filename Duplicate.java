package vamshi;
import java.util.Scanner;
public class Duplicate 
{
	public static void main(String aa[])
	{
		
	Scanner s=new Scanner(System.in);
	System.out.println("Enter array size :");
	int size=s.nextInt();
	int k[]=new int[size];
	int i=0;
	for( i=0;i<k.length;i++)
	{
		 k[i]=s.nextInt();
	}
	for(i=0;i<k.length;i++)
	{
	for(int l=i+1;l<k.length;l++)
		
	{
		if(k[i]==k[l])
			
			System.out.println("duplicate values are"+k[i]);	
	else
	{
		
	}
	}
	}
		
		
	
	
	
	}
	}

