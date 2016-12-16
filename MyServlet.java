
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class MyServlet extends HttpServlet 
{
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException

  {
	  
     String name=request.getParameter("t1");
	 String gender=request.getParameter("t2"); 
	 String dob =request.getParameter("t3"); 
	 String email=request.getParameter("t4");
	 String address=request.getParameter("t5");
	 String phno=request.getParameter("t6");
	 String city=request.getParameter("t7");
	 String state=request.getParameter("t8");
	 String country=request.getParameter("t9");
	
	 

     try
	 {
	    PrintWriter out=response.getWriter();
		
	    if((email.contains("@")) && (email.contains(".com")))
		{
			System.out.println("valid email");
		}
		else
		{
			System.out.println("Invalid email");
		}

	    String[] str1=dob.split("-");
		String s1=str1[0];
		String s2=str1[1];
		String s3=str1[2];
		
		int dd=Integer.parseInt(s1);
		int mm=Integer.parseInt(s2);
		int yy=Integer.parseInt(s3);
		if(yy>=1900 && yy<=2016)
		{
			String date=String.valueOf(dd);
		    String month=String.valueOf(mm);
		    String year=String.valueOf(yy);
		    System.out.println("dob:" +date +month  +year);
		}
		
	 
         FileWriter writer = new FileWriter("a.txt", true);
            writer.write(name);
			writer.write(",");
            writer.write(gender);
		    writer.write(",");
			writer.write(dob);
		    writer.write(",");
            writer.write(email);
			writer.write(",");
            writer.write(address);
			writer.write(",");
            writer.write(phno);
			writer.write(",");
            writer.write(city);
			writer.write(",");
            writer.write(state);
			writer.write(",");
            writer.write(country);
            writer.write("\r\n"); 
			writer.close();	 
			
			
			int count=0;
			File file = new File("a.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				if(line.contains("India"))
				{
					count++;
				stringBuffer.append(line);
				stringBuffer.append("\n");
				}
			}
			fileReader.close();
			System.out.println("Indian Registrations are :"+count);
		
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
  
  }

}