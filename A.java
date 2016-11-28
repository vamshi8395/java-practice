package vamshi;

public class A
{
	public void add()
	{
		System.out.println("A class add method");
		
	}
	public void add(int a)
	{
		System.out.println("A class parameterized aadd");
	}

}
class B extends A
{
	public void add()
	{
		System.out.println("B class addm ethod");
	}
	public static void main(String aa[])
	{
		 A a=new B();
		 a.add();
	}
}
