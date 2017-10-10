import java.net.*;
import java.io.*;
import java.util.Scanner;

class server2{
	ServerSocket ss;
	Socket s;
	InputStream in;
	OutputStream op;
	byte b[] = new byte[1024];
	Scanner sc = new Scanner(System.in);
	String str;
	String menu = "Menu:\n1)Factorial\n2)Square root\n3) Prime number";
	
	server2(){
		try{
			ss = new ServerSocket(3000);
			System.out.println("Server initialized...\nWaiting for Client...");
			s = ss.accept();
			System.out.println("Connection established with Client...");
			menu();
			listen();
		}catch (Exception e){
			System.out.println(e);
		}
	}
	
	void listen(){
		try{
			in = s.getInputStream();
			in.read(b);
			System.out.println("Client Message: "+new String(b).trim());
			if (new String(b).trim().equals("1")){
				send(1);
			}
			else if (new String(b).trim().equals("2")){
				send(2);
			}
			else if (new String(b).trim().equals("3")){
				send(3);
			}
			else{
				op.write("Enter a valid choice...".getBytes());
				menu();
			}
		}catch (Exception e){
			System.out.println(e);
		}
	}
	void menu(){
		try{
			op = s.getOutputStream();
			op.write(menu.getBytes());
		}catch (Exception e){
			System.out.println(e);
		}
	}
	
	void send(int x){
		try{
			if (x==1){
				str = "Enter value: ";
				op = s.getOutputStream();
				op.write(str.getBytes());
				
				in = s.getInputStream();
				in.read(b);
				int fact = Integer.parseInt(new String(b).trim());
				for(int i=fact-1; i>0; i--){
					fact*=i;
				}
				op = s.getOutputStream();
				str = "Factorial is "+fact;
				op.write(str.getBytes());
			}
			/*else if (x==2){
				
			}
			else{
				
			}*/
		}catch (Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String[] s){
		new server2();
	}
}
