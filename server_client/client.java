import java.net.*;
import java.io.*;
import java.util.Scanner;

class client{
	Socket s;
	InputStream in;
	OutputStream op;
	byte b[]=new byte[1024];
	Scanner sc = new Scanner(System.in);
	String x;
	
	client(){
		try{
			s = new Socket(InetAddress.getLocalHost(),3000);
			System.out.println("Connection established with Server...");
			
			while (true){
				send();
				listen();
			}
			
		}catch (Exception e){
			System.out.println(e);
		}
	}
	
	void send(){
		try{
			System.out.print("Enter message: ");
			x = sc.nextLine();
			op = s.getOutputStream();
			op.write(x.getBytes());
		}catch (Exception e){
			System.out.println(e);
		}
	}
	
	void listen(){
		try{
			in = s.getInputStream();
			in.read(b);
			System.out.println("Server message: "+new String(b).trim());
		}catch (Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String[] s){
		new client();
	}
}
