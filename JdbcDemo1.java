import java.sql.*;  
class JdbcDemo{  
public static void main(String args[]){  
try{  
//step1 load the driver class  
BufferedReader br=new BufferedReader(new InputStreanReader(System.in));
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");  
  
//step3 create the statement object  
PreparedStatement pstmt=com.PrepareStatement("insert into EMP values(?,?);
System.out.println("Enter name: ");
String name=br.readLine();
System.out.println("Enter age: ");
int age=Integer.parse

Statement stmt=con.createStatement();  
  
//stmt.executeUpdate("insert into EMP values('Dilip',24)");
//stmt.executeUpdate("delete from EMP where AGE>30");
stmt.executeUpdate("update EMP set AGE=AGE+1");
//step4 execute query  
ResultSet rs=stmt.executeQuery("select * from EMP");  
while(rs.next())  
{
System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
System.out.println();
}
  
//step5 close the connection object  
con.close();  
stmt.close();
con.close();
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  