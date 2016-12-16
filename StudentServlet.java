
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class StudentServlet extends HttpServlet 
{
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException

  {  
     int sage;
	 int smarks;
   	 
     String sid=request.getParameter("t1");
	 String sname=request.getParameter("t2"); 
     sage=Integer.parseInt(request.getParameter("t3"));
	 smarks=Integer.parseInt(request.getParameter("t4"));
	 String sper=request.getParameter("t5");
	 String sgrade=request.getParameter("t6");
	
	
     try
	 {
	    PrintWriter out=response.getWriter();
		
		if((sid.startsWith("S")) && (sid.length()<=4))
		{
			System.out.println("valid id");
		}	
		
		
		if((sname.length())<=30)
		{
			System.out.println("name entered correctly");
		}
		
		if(sage<=25)
		{
			System.out.println("valid age");
		}
		if(smarks>=0)
		{
			System.out.println("marks entered");
		}
		if( sgrade.equals("A") || sgrade.equals("B") || sgrade.equals("C") || sgrade.equals("D") || sgrade.equals("E"))
		{
			System.out.println("grade entered");
		}
		
	    
		
         FileWriter writer = new FileWriter("b.txt", true);
            writer.write(sid);
			writer.write(",");
            writer.write(sname);
		    writer.write(",");
			writer.write(sage);
		    writer.write(",");
            writer.write(smarks);
			writer.write(",");
            writer.write(sper);
			writer.write(",");
            writer.write(sgrade);
            writer.write("\r\n");
			writer.close();	 
			
			
			int count=0;
			File file = new File("b.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				if(line.contains("E"))
				{
					count++;
				stringBuffer.append(line);
				stringBuffer.append("\n");
				}
			}
			fileReader.close();
			System.out.println("Number of Students failed are :"+count);
		
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
  
  }

}