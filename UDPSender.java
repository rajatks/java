import java.io.*;
import java.net.*;
class UDPSender{
	public static void main(String[] args)
	{
			try
			{

				byte data[]=new byte[1024];
				InetAddress ia=InetAddress.getLocalHost();
				//InetAddress ia=InetAddress.getByName("");
				System.out.println(ia);

				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				DatagramSocket ds =new DatagramSocket(1095);
				DatagramPacket dp=null;
				
				System.out.println("enter data ...");
				String line=null;
				do{
					line=br.readLine();
					data=line.getBytes();
					dp=new DatagramPacket(data,data.length,ia,1096);
					ds.send(dp);
					System.out.println(line);
				}
				while(!line.equals("end"));
				ds.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}