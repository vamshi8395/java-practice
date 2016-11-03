import java.util.Scanner;
public class Rev 
{

   public static void main(String args[])
   {
	   int n,reverse=0;
	   System.out.println("enter the num to reverse:");
	Scanner in=new Scanner(System.in);
	
	n=in.nextInt();
	while (n!=0)
	{
		reverse=reverse*10;
		reverse=reverse+n%10;
		n=n/10;
	
	}
	System.out.println("rev is:"+reverse);

}
}

