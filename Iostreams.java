package vamshi;
import java.io.*;
public class Iostreams 
{
	  public static void main(String args[])
	  { 
		  
		   try{  
		     FileOutputStream fout=new FileOutputStream("vam.txt");  
		     String s="Sachin Tendulkar is my favourite player";  
		     byte b[]=s.getBytes();//converting string into byte array  
		     fout.write(b);  
		     fout.close();  
		     System.out.println("success...");  
		//    }
		  // catch(Exception e)
		   //{
			 //  System.out.print(e);
		//	   }  
		  
	//  try{  
		    FileInputStream fin=new FileInputStream("vam.txt");  
		    int i=0;  
		    while((i=fin.read())!=-1){  
		     System.out.print((char)i);  
		    }  
		    fin.close();  
		//  }
	  //catch(Exception e)
	  //{
		//  System.out.println(e);
	//  }
//	  try{
	  FileInputStream fin1=new FileInputStream("vam.txt");  
	  FileOutputStream fout1=new FileOutputStream("Man.txt");  
	//  int i=0;  
	  while((i=fin1.read())!=-1){  
	  fout1.write((byte)i);  
	  }  
	  fin1.close();
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	  }
	  }
	  
	  






