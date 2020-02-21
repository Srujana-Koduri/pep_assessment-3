package calculator_layered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Calc_client {
	
	public static String ip = "localhost";
	public static int port = 8888;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			Socket sock = new Socket(ip, port);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader brs = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			PrintStream ps = new PrintStream(sock.getOutputStream());
				for(int i = 0; i < 2; i++) {
					System.out.print("Enter the number : ");
					int num = Integer.parseInt(br.readLine());
					ps.println(num);
				}
				
				System.out.println("'+'. Addition...");
				System.out.println("'-'. Subtract...");
				System.out.println("'*'. Multiply...");
				System.out.println("'/'. Divide...");
				System.out.println("'#'. Exit...");
				System.out.print("Enter your option : ");
				
				char ch = (char) br.read();
				ps.println(ch);
				System.out.println("The answer is : " + brs.readLine());
			
			
		} catch(UnknownHostException e) {
			System.out.println("Something is problem in port number and ip address.");
		} catch (IOException e) {
			System.out.println("Something went wrong with the input and output stage.");
			e.printStackTrace();
		}
		

	}

}
