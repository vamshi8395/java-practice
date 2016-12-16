
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class CustomerServlet extends HttpServlet 
{
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException

  { 
     
     String cid=request.getParameter("t1");
	 String cname=request.getParameter("t2"); 
     String cgender=request.getParameter("t3");
	 String cage=request.getParameter("t4");
	 String caddress=request.getParameter("t5");
	 String ccity=request.getParameter("t6");
	 String ccountry=request.getParameter("t7");
	 String cpin=request.getParameter("t8");
	 String cphone=request.getParameter("t9");
	 String caoi=request.getParameter("t10");
	 String cdob=request.getParameter("t11");
	
	
     try
	 {
	    PrintWriter out=response.getWriter();
		
		if((cid.startsWith("C")) && (cid.length()<=4))
		{
			System.out.println("valid id");
		}	
	
		
		if((cdob.length())<=8)
		{
			System.out.println("dob entered correctly");
		}
		
		
		
	    FileWriter writer = new FileWriter("c.txt", true);
            writer.write(cid);
			writer.write(",");
            writer.write(cname);
		    writer.write(",");
			writer.write(cgender);
		    writer.write(",");
            writer.write(cage);
			writer.write(",");
            writer.write(caddress);
			writer.write(",");
            writer.write(ccity);
			writer.write(",");
            writer.write(ccountry);
			writer.write(",");
            writer.write(cpin);
			writer.write(",");
            writer.write(cphone);
			writer.write(",");
            writer.write(caoi);
			writer.write(",");
            writer.write(cdob);
            writer.write("\r\n");
			writer.close();	 
			
			
			int c=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
			File file = new File("c.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) 
			{
				
				String[] words = line.split(",");
	         
			   // System.out.println(words[0]  +words[1] +words[2] +words[3] +words[4] +words[5] +words[6] +words[7] +words[8] +words[9] +words[10]);
				if(words[2].equals("male"))
				{
					c++;
				  stringBuffer.append(line);
				  stringBuffer.append("\n");
				}
				else
				{
					c1++;
					stringBuffer.append(line);
				    stringBuffer.append("\n");
				} 
				
				if(words[6].equals("India"))
				{
					c2++;
				}
				else if(words[6].equals("US"))
				{
					c3++;
				}
				else if(words[6].equals("SriLanka"))
				{
					c4++;
				}
				else
				{
				   c5++;	
				}
				
				if(words[9].equals("Travelling"))
				{
					c6++;
				}
				else if(words[9].equals("Reading"))
				{
					c7++;
				}
				
				if(words[8].equals(" "))
				{
					c8++;
				}
				
				String age=words[3];
				int age1=Integer.parseInt(age);
				if(age1>18)
				{
					c9++;
				}
				
			}
			fileReader.close();
			System.out.println("Number of male customers are :"+c);
			System.out.println("Number of female customers are :"+c1);
			System.out.println("Number of India customers are :"+c2);
			System.out.println("Number of US customers are :"+c3);
			System.out.println("Number of SriLanka customers are :"+c4);
			System.out.println("Number of Australia customers are :"+c5);
			System.out.println("Number of Travelling customers are :"+c6);
			System.out.println("Number of Reading customers are :"+c7);
			System.out.println("Number of customers having no phone number are :"+c8);
			System.out.println("Number of 18+ age customers are :"+c9);
		
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
  
  }

}