import java.io.*;
class IODemo2
{
	public static void main(String[] args){
		try{
			/*
			RandomAccessFile rnf=new RandomAccessFile("abc.txt","rw");
			//rnf.seek(5);
			System.out.println(rnf.readLine());
			rnf.seek(rnf.length());
			rnf.writeBytes("JUST FOR DEMO");
			rnf.close();
			*/
/*
			//PrintWriter pw= new PrintWriter(System.in);
			PrintWriter pw=new PrintWriter(new FileOutputStream("abc.txt",true));
			pw.println("HELLO COGNI");
			pw.flush();	
			pw.close();
*/
			File dir1=new File("abc");
			dir1.mkdir();
			File dir2=new File(dir1,"xyz");
			dir2.mkdir();
			File f=new File(dir2,"atoz.txt");
			f.createNewFile();
			PrintWriter pw=new PrintWriter(new FileOutputStream(f,true));
			pw.println(args[0]);
			pw.flush();
			pw.close();
			
		}
		catch(Exception e){
			System.out.println(e);
			}
	}
}