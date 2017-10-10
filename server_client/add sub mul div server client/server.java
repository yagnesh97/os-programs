import java.net.*;
import java.io.*;

class server{
	ServerSocket ss;
	Socket s;
	InputStream in;
	OutputStream op;
	byte b[];
	String x,y;
	
	server(){
		try{
			ss = new ServerSocket(3000);
			s = ss.accept();
			
			x = "Enter 1st num: ";
			op = s.getOutputStream();
			op.write(x.getBytes());
			
			in = s.getInputStream();
			b = new byte[10];
			in.read(b);
			x = new String(b).trim();
			int a = Integer.parseInt(x);
			
			y = "Enter 2nd num: ";
			op.write(y.getBytes());
			
			b = new byte[10];
			in.read(b);
			y = new String (b).trim();
			int b = Integer.parseInt(y);
			
			String ans = "\n\nAddition: "+String.valueOf(a+b)+"\nSubtraction: "+String.valueOf(a-b)+"\nMultiplication: "+String.valueOf(a*b)+"\nDivision: "+String.valueOf(a/b);
			op.write(ans.getBytes());
			
		}catch (Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String[] s){
		new server();
	}
}
