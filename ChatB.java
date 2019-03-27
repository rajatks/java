import java.io.*;
import java.net.*;
class UDPSender2 extends Thread{
	public void run()
	{
			try
			{

				byte data[]=new byte[1024];
				InetAddress ia=InetAddress.getLocalHost();
				//InetAddress ia=InetAddress.getByName("");
				System.out.println(ia);

				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				DatagramSocket ds =new DatagramSocket(1096);
				DatagramPacket dp=null;
				
				System.out.println("enter name ...");
				String name=br.readLine();
				String line=null;
				do{
					line=br.readLine();
					line=name+" "+line;
					data=line.getBytes();
					dp=new DatagramPacket(data,data.length,ia,1098);
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

class UDPReceiver3 extends Thread{
	public void run()
	{
			try
			{

				byte data[]=new byte[1024];
				DatagramSocket ds=new DatagramSocket(1097);
				DatagramPacket dp=new DatagramPacket(data,data.length);
				String line=null;
				do{
					ds.receive(dp);
					line=new String(dp.getData(),0,dp.getLength());
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
class ChatB{
	public static void main(String[] args)
	{
	 	UDPSender2 s2=new UDPSender2();
		UDPReceiver3 r3=new UDPReceiver3();
		s2.start();
		r3.start();
			
	}
}