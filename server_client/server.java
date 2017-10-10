import java.net.*;
import java.io.*;
import java.util.Scanner;

class server{
	ServerSocket ss;
	Socket s;
	InputStream in;
	OutputStream op;
	byte b[] = new byte[1024];
	Scanner sc = new Scanner(System.in);
	String x;
	
	server(){
		try{
			ss = new ServerSocket(3000);
			System.out.println("Server initialized...\nWaiting for Client...");
			s = ss.accept();
			System.out.println("Connection established with Client...");
			while (true){
				listen();
				send();
			}
		}catch (Exception e){
			System.out.println(e);
		}
	}
	
	void listen(){
		try{
			in = s.getInputStream();
			in.read(b);
			System.out.println("Client Message: "+new String(b).trim());
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
	
	public static void main(String[] s){
		new server();
	}
}
