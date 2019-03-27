import java.io.*;
import java.net.*;
class TCPServer{
	public static void main(String[] ARGS)
	{
			try
			{
				ServerSocket ss=new ServerSocket(95);
				System.out.println("server Running..");
				Socket cs=ss.accept();
				System.out.println("connected to:"+cs);
				BufferedReader br=new BufferedReader(new InputStreamReader(cs.getInputStream()));

				String line=null;
				do{
					line=br.readLine();
					System.out.println("client:  "+line);
				}
				while(!line.equals("end"));
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}