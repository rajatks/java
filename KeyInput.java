import java.util.*;
public class KeyInput{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter name: ");
String name=sc.nextLine();
System.out.println("Enter age: ");
int age=sc.nextInt();
System.out.println("Are you married : ");
boolean married=sc.nextBoolean();

System.out.println("Enter salary: ");
float salary=sc.nextFloat();

System.out.println("--------------------- ");


System.out.println(" name is : "+ name);
System.out.println("age: "+age);
System.out.println("married : "+married);
System.out.println("salary: "+salary);
}
}