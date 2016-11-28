package vamshi;
import java.sql.*;
public class Insert {

	public static void main(String[] args) {
				try{
					String name="aaa",id="50",p="sss";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/vamshi","root","root");
				System.out.println("connection established");
				PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?)");
				ps.setString(1, name);
				ps.setString(2, id);
				ps.setString(3, p);
				ps.executeUpdate();
				
				
				con.close();
				}
				catch(Exception e)
				{
					
				}
		

		

	}

}
