import java.util.*;
import java.io.*;

class EmpDatabase
{
	public EmpDatabase(){
		try{   
Class.forName("oracle.jdbc.driver.OracleDriver");  

Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","system","password-1");  
  
Statement stmt=con.createStatement();  
  
//stmt.executeUpdate("insert into EMP values('Dilip',24)");
//stmt.executeUpdate("delete from EMP where AGE>30");
//stmt.executeUpdate("update EMP set AGE=AGE+1");
//step4 execute query  
ResultSet rs=stmt.executeQuery("select * from EMP");  
while(rs.next())  
{
System.out.println(rs.getString(1)+"  "+rs.getString(2));  
System.out.println();
}
  
//step5 close the connection object  
con.close();  
stmt.close();
con.close();
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  