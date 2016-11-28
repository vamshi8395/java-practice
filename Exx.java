import java.util.Scanner;

public class Exx {
public static void main(String aa[])
{
	int n,r=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter yout number");
	int a=s.nextInt();
	for(n=1;n<=10;n++)
	{
		r=a*n;
		System.out.println(a+"*"+n+"="+r);	
	}
	
}
}
