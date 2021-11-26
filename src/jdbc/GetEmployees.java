package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetEmployees {
    public static void main(String[] args) {
	 try {//load the driver in the memory
         Class.forName("oracle.jdbc.driver.OracleDriver");
         Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
         //1  : type of the driver, port number and service name
         //2  : username
         //3    : password
      System.out.println("connection is successful!!!");
      Statement stmt=con.createStatement();
      ResultSet rs=stmt.executeQuery("select * from emp3");
      while(rs.next())
      {
    	  System.out.println(rs.getInt(1));
    	  System.out.println(rs.getString(2));
    	  System.out.println(rs.getInt(3));
     }
      rs.close();
	 }
     catch(Exception e)
     {
          System.out.println(e);
     }
    }
}