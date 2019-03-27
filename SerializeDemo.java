import java.io.*;
class SerializeDemo{
	public static void main(String args[])
	{
		try
		{
			Person p1=new Person();
			p1.name="Raaj";
			p1.age=25;
			ObjectOutputStream oos=new ObjectOutputStream(
				new FileOutputStream("emp.ser"));
			oos.writeObject(p1);
			System.out.println("success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
