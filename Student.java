import java.util.Scanner;
public class Student 
{
public static void main(String aa[])
{
Scanner s=new Scanner(System.in);

System.out.println("Enter your name :");
String name=s.next();
System.out.println("Enter your marks : :");

int s1=s.nextInt();
int s2=s.nextInt();
int s3=s.nextInt();
int s4=s.nextInt();
int s5=s.nextInt();
int total=s1+s2+s3+s4+s5;


float per=total/5;

if((per>=85)&&(per<=100))
	
{
	System.out.println(name+  per+" GRADE : A+");
}
else if((per>=75)&&(per<=84))
{
System.out.println(name+  per+" GRADE : A");
}
else if((per>=65)&&(per<=74))
{
	System.out.println(name+  per+" GRADE : B");
}
else if((per>=50)&&(per<64))
{
	System.out.println(name+  per+" GRADE : C");
}
else if(per<50)

	System.out.println(name+  per+" GRADE : FAIL");
	{

}
}

}