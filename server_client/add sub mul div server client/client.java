import java.net.*;
import java.io.*;
import java.util.Scanner;

class client{
	Socket s;
	InputStream in;
	OutputStream op;
	byte b[];
	Scanner sc = new Scanner(System.in);
	String x;
	int i=0; 
	
	client(){
		try{
			s = new Socket(InetAddress.getLocalHost(),3000);
			in = s.getInputStream();
			op = s.getOutputStream();
			while(i<3){
				b = new byte[100];
				in.read(b);
				System.out.println(new String(b).trim());
				x = sc.next();
				op.write(x.getBytes());
				i++;
			}
			
		}catch (Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String[] s){
		new client();
	}
}
