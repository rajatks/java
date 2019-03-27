import java.lang.*;
class LangDemo
{
	public static void main(String[] args)
	{
		try{
		Runtime rt=Runtime.getRuntime();
		System.out.println("see the magic");
		Thread.sleep(5000);
		Process p1=rt.exec("explorer.exe");
		Thread.sleep(10000);
		p1.destroy();
		}
		catch(Exception e){
			System.out.println(e);
			}
	}
}