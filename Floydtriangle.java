package vamshi;
import java.util.Scanner;

public class Floydtriangle {
public static void main(String a[])
{
	int rows,num=1,i,j;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your desired number of rows for triangle");
	rows=s.nextInt();
	System.out.println("Floyd triangle");
	for(i=1;i<=rows;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(num+"");
			num++;
		}
		System.out.println();	
	}
	
}
}
