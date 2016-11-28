package vamshi;
import java.util.Scanner;
public class Wordcountbysplit {
	public static void main(String[] args) 
	{
		
		
		int count =0;
		String s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your String");
		
		String str = sc.nextLine();
		
		System.out.println(str);
		
	String arr[]=str.split(" ");
		
		for(int i =0;i<arr.length;i++)
		{
			count ++ ;
			
		}
		System.out.println(count);

	}

}
	
