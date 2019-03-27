import java.io.*;
class DeserializeDemo{
	public static void main(String args[])
	{
		try
		{
			
			ObjectInputStream ois=new ObjectInputStream(
				new FileInputStream("emp.ser"));
			Person p1=(Person)ois.readObject();
			System.out.println(p1.name);
			System.out.println(p1.age);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
