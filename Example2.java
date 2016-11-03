
public class Example2 
{ 
   public void add()
	{
		
		System.out.println("add method");
	}
	public  void add(int a,float b)
	{
		System.out.println("int method");
	}
	public  void add(float a,int b)
	{
		System.out.println("float method");
	}
	public static void main(String aa[])
	{
		int h=8;
		Example2 obj=new Example2();
		obj.add();
		obj.add(4,8.7f);
		
		
	}

}
