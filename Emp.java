
import java.util.*;
import java.io.*;

 abstract class Emp 
{

	private String name;
	private String degi;
	private float salary;
	public static int count=0;
	private int age;
public Emp(String desig)
{
System.out.print("\nEnter a details for"+desig+":-");
	
Scanner sc=new Scanner(System.in);
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
		System.out.println("Enter correct Age\n");
	
	}catch(Exception e)
	{
		
		System.out.println(e.getClass().getCanonicalName());
		System.out.println("Enter correct Age\n");
	}	
	if(this.getage()>=21 && this.getage()<61){
		flag=false;
	}
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

public void setsalary(float salary){
	this.salary=salary;
	}
public float getsalary(){
	return this.salary;
	}

public void setdegi(String degi){
	this.degi=degi;
	}
public String getdegi(){
	return this.degi;
	}


public final void display()
{
System.out.println("---------------------------------");


System.out.println("name is : "+getname());


System.out.println("age is : "+age);

System.out.println("degini is : "+degi);

System.out.println("salary is : "+salary);
//System.out.println("Count is : "+count);

}

public void  incsalary()
{

salary=salary+2000;
}
}

final class Clerk extends Emp
{
public Clerk(){

super("Clerk");
 this.setdegi("clerk");
this.setsalary(8000);

}

}

final class Programmer extends Emp
{


public Programmer(){

super("Programmer");
this.setdegi("Programer");
 this.setsalary(25000);

}


public void incsalary()
{

setsalary(getsalary()+5000);
}


}

final class Manager extends Emp
{


public Manager(){


super("Manager");
 this.setdegi("Manager");
 this.setsalary(80000);
}


public void incsalary()
{
setsalary(getsalary()+10000);
}

}

public class Employee{
public static void main(String[] args)
{	ArrayList<Emp> a1=new ArrayList<Emp>();
	boolean flag=true,flag1=true;
	Scanner sc=new Scanner(System.in);
	while(flag){

	System.out.println("Enter the detail where u want to go ");
	System.out.println("Enter 1.Create ");
	System.out.println("Enter 2.Display ");
	System.out.println("Enter 3.RaiseSalary ");
	System.out.println("Enter 4.Exit ");
        
	int n=sc.nextInt();
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
			for(Emp a:a1){
				a.display();
			}
		break;
		
		case 3:
			for(Emp a:a1){
				a.incsalary();
			}
		break;
		case 4:{
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

