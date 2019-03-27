import java.io.*;
import java.net.*;
class TCPClient{
	public static void main(String[] args)
	{
			try
			{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				InetAddress ia=InetAddress.getLocalHost();

				Socket cs=new Socket(ia,95);
				PrintWriter out=new PrintWriter(cs.getOutputStream());
				
				String line=null;
				System.out.println("enter data to be sented...");
				do
				{
					line=br.readLine();
					out.println(line);
					out.flush();
				}
				while(!line.equals("end"));
				out.close();
				br.close();
				cs.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}