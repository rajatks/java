public class Person implements java.io.Serializable
{
	String name;
	int age;
	public Person(){}
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		//return "Name is "+name+" Age is "+age+"\n";
		//return "";
		System.out.println("Name is :"+name);
		System.out.println("Age is :"+age);
		return " ";
	}
}
