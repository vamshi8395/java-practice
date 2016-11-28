package vamshi;
import java.sql.*;
public class Jbc {
	public static void main(String aa[])
	{
		try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/vamshi","root","root");
		System.out.println("connection established");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from product where shipmentnum=45");
		while(rs.next())
		{
			System.out.print(rs.getString(1));
			System.out.print(rs.getString(2));
			System.out.println(rs.getString(3));
		}
		con.close();
		}
		catch(Exception e)
		{
			
		}
	}

}
