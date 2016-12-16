
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class MovieServlet extends HttpServlet 
{
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException

  { 
     
     String movieid=request.getParameter("t1");
	 String moviename=request.getParameter("t2"); 
     String releasedate=request.getParameter("t3");
	 String rating=request.getParameter("t4");
	 String movieduratn=request.getParameter("t5");
	
	
     try
	 {
	    PrintWriter out=response.getWriter();
	
		
		if((releasedate.length())<=8)
		{
			System.out.println("dob entered correctly");
		}
		 
		int rate=Integer.parseInt(rating);
       if(rate>0 && rate<=10)
	   {
		   System.out.println("data entered");
	   }

       String rating1=String.valueOf(rate);	   
		
		
	    FileWriter writer = new FileWriter("e.txt", true);
            writer.write(movieid);
			writer.write(",");
            writer.write(moviename);
		    writer.write(",");
			writer.write(releasedate);
		    writer.write(",");
            writer.write(rating1);
			writer.write(",");
            writer.write(movieduratn);
            writer.write("\r\n");
			writer.close();	 
			
			
			int c=0,c1=0;
			File file = new File("e.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) 
			{
				
				String[] words = line.split(",");
	         
				String md=words[4];
				int md1=Integer.parseInt(md);
				if(md1==9000)
				{
					c++;
				  stringBuffer.append(line);
				  stringBuffer.append("\n");
				}
				
				int data=words[0].length;
				
				String rate=words[3];
				int rate1=Integer.parseInt(rate);
				if(rate1==4)
				{
					c1++;
				}
				
                String date=words[2];
				
			}
			fileReader.close();
			System.out.println("Movies having duration 2.5hrs  :"+c);
			System.out.println("Total no of movies data available :"+data);
			System.out.println("Number of movies having 4 rating :"+c1);
			
			
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
  
  }

}