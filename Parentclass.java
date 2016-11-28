package vamshi;

public class Parentclass {
	
	
	   int num=100;
	}
	
	class SuperKeyword extends Parentclass
	{
	   int num=110;
	   void printNumber()
	   {
	
	      System.out.println(super.num);
	   }
	   public static void main(String args[])
	   { 
	      SuperKeyword obj= new SuperKeyword();
	      obj.printNumber();	
	   }
	}


