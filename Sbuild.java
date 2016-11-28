import java.lang.*;
public class Sbuild 
{
	
	   public static void main(String[] args) 
	   {
	  
	   StringBuilder str = new StringBuilder("remember by name ");
	   System.out.println("string = " + str);
	    
	  
	   str.append("i knock your door");
	   
	   System.out.println("After append = " + str);
	    
	   str = new StringBuilder("its me ");
	   System.out.println("string = " + str);
	    
	   str.append("heisenberg");
	   
	   System.out.println("After append = " + str);
	   }
	} 

