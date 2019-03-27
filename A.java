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
System.out.println("enter age: ");
age=sc.nextInt();
count++;
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
System.out.println("Count is : "+count);

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
{


Emp e1=new Clerk();

Emp e2=new Programmer();

Emp e3=new Manager();
e1.display();
e1.incsalary();
e1.display();

e2.display();
e2.incsalary();
e2.display();

e3.display();
e3.incsalary();
e3.display();

}
}

