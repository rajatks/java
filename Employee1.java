
import java.util.*;
import java.io.*;

abstract class Emp 
{
	private int id;
	private String name;
	private String degi;
	private int salary;
	public static int count=0;
	private int age;
public Emp(int salary,String desig)
{
System.out.print("\nEnter a details for"+desig+":-");
	
Scanner sc=new Scanner(System.in);
System.out.println("Enter id : ");
id=sc.nextInt();
sc.nextLine();
System.out.println("enter name: ");
name=sc.nextLine();
boolean flag=true;
System.out.println("enter age: ");
while(flag)
{
	try{
		this.setage(Integer.parseInt(sc.nextLine()));
		if(this.getage()<21 || this.getage()>61)
			throw new UserDefined("Age is not is range please enter range 21 to 60");
	}catch(UserDefined e)
	{
		System.out.println(e.getMessage());
		System.out.println("Enter Age again \n");
	
	}catch(Exception e)
	{
		
		System.out.println(e.getClass().getCanonicalName());
		System.out.println("Enter correct Age\n");
	}	
	if(this.getage()>=21 && this.getage()<61){
		flag=false;
	}
}
this.salary=salary;
this.degi=desig;	

		try{
			
			PrintWriter pw=new PrintWriter(new FileOutputStream("abc.txt",true));
			pw.println(this.id+"| "+this.name+"| "+this.age+"| "+this.salary+"| "+this.degi);
			pw.flush();	
			pw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
count++;
}
public static void countDetails(){
System.out.println("total Employee are :"+count);
}

public void setname(String name){
	this.name=name;
	}
public String getname(){
	return this.name;
	}

public void setage(int age){
	this.age=age;
	}
public int getage(){
	return this.age;
	}

public void setsalary(int salary){
	this.salary=salary;
	}
public int getsalary(){
	return this.salary;
	}

public void setdegi(String degi){
	this.degi=degi;
	}
public String getdegi(){
	return this.degi;
	}

/*
public final void display()
{
System.out.println("---------------------------------");


System.out.println("name is : "+getname());


System.out.println("age is : "+age);

System.out.println("degini is : "+degi);

System.out.println("salary is : "+salary);
//System.out.println("Count is : "+count);

}
*/



public String toString(){//overriding the toString() method  
  return "Id is : "+id+"\n"+ "name is : "+getname()+"\n"+ "age is : "+age+"\n"+"degini is : "+getdegi()+"\n"+"salary is : "+salary+"\n";
 } 

public static void  incsalary()
{
try{  

Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","system","password-1");  
Statement stmt=con.createStatement();  
  

}
public ststic void delete()
{
try{  

Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","system","password-1");  
Statement stmt=con.createStatement();
Bufferedreader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Emp id :");
int id=Integer.parseInt(br.readLine());
ResultSet rs=stmt.excuteQuery("select * from Employee where EID=''+id);
if(rs.next())
{
	System.out.println("ID : "+rs.getInt(1));
	System.out.println("ID : "+rs.getInt(1));
	
}
public static void display()
{
		BufferedReader fr=null;
		try{
			File f=new File("abc.txt");
			if(f.exists())
			{
				 fr=new BufferedReader(new FileReader(f));
				String line=null;
				while((line=fr.readLine())!=null)
				{
					StringTokenizer st=new StringTokenizer(line,"i");
					System.out.println("\n Id:"+st.nextToken());
					System.out.println("\n name:"+st.nextToken());
					System.out.println("\n Age:"+st.nextToken());
					System.out.println("\n Salary:"+st.nextToken());
					System.out.println("\n Desigination :"+st.nextToken());
				}
			}
			else
			{
				System.out.println("No Records is Found \n");
			}

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			//if(fr!=null)
			try{
				if(fr!=null)
					fr.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
}
}

class NameSorter implements Comparator
{
		public int compare(Object obj1,Object obj2)
		{
			Emp p1=(Emp) obj1;
			Emp p2=(Emp) obj2;
			String n1=p1.getname();	
			String n2=p2.getname();

			return n1.compareTo(n2);
		}

}
class AgeSorter implements Comparator
{
		public int compare(Object obj1,Object obj2)
		{
			Emp p1=(Emp) obj1;
			Emp p2=(Emp) obj2;
			Integer n1=p1.getage();	
			Integer n2=p2.getage();
			return n1.compareTo(n2);
		}

}
class SalarySorter implements Comparator
{
		public int compare(Object obj1,Object obj2)
		{
			Emp p1=(Emp) obj1;
			Emp p2=(Emp) obj2;
			Integer n1=p1.getsalary();	
			Integer n2=p2.getsalary();
			return n1.compareTo(n2);
		}

}
class DesignationSorter implements Comparator
{
		public int compare(Object obj1,Object obj2)
		{
			Emp p1=(Emp) obj1;
			Emp p2=(Emp) obj2;
			String n1=p1.getdegi();	
			String n2=p2.getdegi();

			return n1.compareTo(n2);
		}

}

final class Clerk extends Emp
{
public Clerk(){

super(8000,"Clerk");
// this.setdegi("clerk");
//this.setsalary(8000);

}

}

final class Programmer extends Emp
{


public Programmer(){

super(25000,"Programmer");
//this.setdegi("Programer");
// this.setsalary(25000);

}


public void incsalary()
{

setsalary(getsalary()+5000);
}


}

final class Manager extends Emp
{


public Manager(){


super(80000,"Manager");
// this.setdegi("Manager");
// this.setsalary(80000);
}


public void incsalary()
{
setsalary(getsalary()+10000);
}

}

public class Employee1{
public static void main(String[] args)
{	ArrayList<Emp> a1=new ArrayList<Emp>();
	boolean flag=true,flag1=true;
	boolean flag2=true;
	int n;

	Scanner sc=new Scanner(System.in);
	while(flag){

	System.out.println("Enter the detail where u want to go ");
	System.out.println("Enter 1.Create ");
	System.out.println("Enter 2.Display ");
	System.out.println("Enter 3.RaiseSalary ");
	System.out.println("Enter 4.Delete ");
	System.out.println("Enter 5.Exit ");
         n=sc.nextInt();
  	switch(n)
	{
	case 1:{
		while(flag1){
			System.out.println("Enter 1.Clerk ");
			System.out.println("Enter 2.Programmer ");
			System.out.println("Enter 3.Manager ");
			System.out.println("Enter 4.Exit ");
			int x=sc.nextInt();
			switch(x){
				case 1:
					 Emp c=new Clerk();
						a1.add(c);
						break;
				case 2:
					 Emp p=new Programmer();
						a1.add(p);
						break;
				case 3:
					 Emp m=new Manager();
						a1.add(m);
						break;
				case 4:{
					flag1=false;
					break;
					}
				default:System.out.println("invalid input");
				break;
				}
			 }
			break;
		}
		case 2:
			System.out.println("Enter how u want to sort on the basics of :  ");
			System.out.println("Enter 1.Name ");
			System.out.println("Enter 2.Age ");
			System.out.println("Enter 3.Salary ");
			System.out.println("Enter 4.Desigination ");
			int k=sc.nextInt();
			switch(k)
			{
				case 1:
				Collections.sort(a1,new NameSorter());
				break;
				case 2:
				Collections.sort(a1,new AgeSorter());
				break;
				case 3:
				Collections.sort(a1,new SalarySorter());
				break;
				case 4:
				Collections.sort(a1,new DesignationSorter());
				break;
			}

		Iterator<Emp> it=a1.iterator();
				while(it.hasNext())
				{
				System.out.println(it.next());
				}

				
		break;
		
		case 3:
			Iterator<Emp> i=a1.iterator();
			while(i.hasNext())
			{
				i.next().incsalary();
			}
		break;
		case 4:
		break;
		case 5:{
		flag=false;
		Emp.countDetails();
		break;
		}
		default:System.out.println("Invalid Input:");
			break;
	}
	}
}


}

