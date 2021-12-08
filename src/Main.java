import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


 public class Main {

		public static void main(String[] args) {
				// TODO Auto-generated method stub

				try {

					//1.CONNECTION CREATION
					
					Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");
					
					//2.CREATE STATEMENT
					
					Statement myst=(Statement)mycon.createStatement();
					
					//3.QUERY CFREATION
					ResultSet rs=myst.executeQuery("select *from employee");  //we can fire any query we want here in()
					
					while(rs.next()) {
						System.out.println(rs.getNString("empname")+ " " +rs.getNString("emprole"));
						
					}
				}
				catch(Exception e)
				{
				
					e.printStackTrace();	}
				
		}
 }
			
