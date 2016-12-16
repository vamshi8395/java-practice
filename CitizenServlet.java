
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class CitizenServlet extends HttpServlet 
{
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException,ServletException

  { 
     
     String aadharno=request.getParameter("t1");
	 String name=request.getParameter("t2"); 
     String gender=request.getParameter("t3");
	 String dob=request.getParameter("t4");
	 String address=request.getParameter("t5");
	 String city=request.getParameter("t6");
	 String country=request.getParameter("t7");
	 String pin=request.getParameter("t8");
	 String phone=request.getParameter("t9");
	 String edudetails=request.getParameter("t10");
	 String age=request.getParameter("t11");
	 String workingstat=request.getParameter("t12");
	 String maritalstat=request.getParameter("t13");
	 String sal=request.getParameter("t14");
	 String nodep=request.getParameter("t15");
	
	
     try
	 {
	    PrintWriter out=response.getWriter();
	
		
		if((dob.length())<=8)
		{
			System.out.println("dob entered correctly");
		}
		
		float sal1=Float.parseFloat(sal);
		if(sal1<=0)
		{
			System.out.println("invalid salary");
		}
		String sal2=String.valueOf(sal1);
		
		if((workingstat.contains("yes")) || (workingstat.contains("no")))
		{
			System.out.println("valid status");
		}
		else
		{
		   System.out.println("invalid status");	
		}
	
		
		if((maritalstat.contains("yes")) || (maritalstat.contains("no")))
		{
			System.out.println("valid status");
		}
		else
		{
		   System.out.println("invalid status");	
		}
		
		
	    FileWriter writer = new FileWriter("d.txt", true);
            writer.write(aadharno);
			writer.write(",");
            writer.write(name);
		    writer.write(",");
			writer.write(gender);
		    writer.write(",");
            writer.write(dob);
			writer.write(",");
            writer.write(address);
			writer.write(",");
            writer.write(city);
			writer.write(",");
            writer.write(country);
			writer.write(",");
            writer.write(pin);
			writer.write(",");
            writer.write(phone);
			writer.write(",");
            writer.write(edudetails);
			writer.write(",");
            writer.write(age);
			writer.write(",");
            writer.write(workingstat);
			writer.write(",");
            writer.write(maritalstat);
			writer.write(",");
            writer.write(sal2);
			writer.write(",");
            writer.write(nodep);
            writer.write("\r\n");
			writer.close();	 
			
			
			int c=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0;
			File file = new File("d.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) 
			{
				
				String[] words = line.split(",");
	         
				String age1=words[10];
				int age2=Integer.parseInt(age1);
				if(age2>=18)
				{
					c++;
				  stringBuffer.append(line);
				  stringBuffer.append("\n");
				}
				
				if(words[11].contains("no"))
				{
					c1++;
				}
				
				if(words[12].contains("yes"))
				{
					c2++;
				}
				
				String salary=words[13];
				float salary1=Float.parseFloat(salary);
				if(salary1>10000)
				{
					c3++;
				}
				
				if(age2>=50)
				{
					c4++;
				}
				
				String nod=words[14];
				int nod1=Integer.parseInt(nod);
				if(nod1>4)
				{
					c5++;
				}
				
				if(words[9].contains("Graduation"))
				{
					c6++;
				}
				if(age2>=18)
				{
					if(words[2].equals("male"))
					{
						c7++;
					}
					else
					{
						c8++;
					}
				}
				
			}
			fileReader.close();
			System.out.println("Number of voting eligible citizens are :"+c);
			System.out.println("Number of not working citizens are :"+c1);
			System.out.println("Number of married citizens are :"+c2);
			System.out.println("Number of citizens having salary above 10k are :"+c3);
			System.out.println("Number of citizens come under senior citizen category are :"+c4);
			System.out.println("Number of citizens having above 4 num of dependents are :"+c5);
			System.out.println("Number of graduate citizens are :"+c6);
			System.out.println("Number of voting eligible male citizens are :"+c7);
			System.out.println("Number of voting eligible female citizens are :"+c8);
			
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
  
  }

}