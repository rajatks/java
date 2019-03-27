import java.io.*;
class Abc implements Runnable
{
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println(Thread.currentThread().getName()+" :"+i);
				try
				{
					Thread.sleep(500);
				}
				catch(Exception e)
				{System.out.println(e);
				}
			}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("J "+ i);
		}
	}
}
class C extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("K "+ i);
		}
	}
}
public class ThreadDemo
{
	public static void main(String[] args)
	{
			A a1=new A();
			B b1=new B();
			C c1=new C();

			a1.start();
			b1.start();
			c1.start();
		System.out.println("MAIN HEre");
	}
}