import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class Welcome extends HttpServlet
{
public void dopost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException

{
PrintWriter out=res.getWriter();
out.println("WElcome to SERVLETS");
}
}