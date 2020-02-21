package calculator_layered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Calc_server {
	public static int port = 8888;
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			ServerSocket serverSock = new ServerSocket(port);
			Socket sock = serverSock.accept();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			PrintStream ps = new PrintStream(sock.getOutputStream());
				int[] temp = new int[2];
				for(int i = 0; i < 2; i++) {
					temp[i] = Integer.parseInt(br.readLine());
				}
				char ch = (char) br.read();
				int ans = 0;
				switch (ch) {
				case '+' : for(int i = 0; i < 2; i++) {
								ans = ans + temp[i];
							}
							ps.println(ans);
							break;
				case '-' : ans = temp[0];
						for(int i = 1; i < 2; i++) {
								ans = ans - temp[i];
							}
							ps.println(ans);
							break;
				case '*' : ans = 1; 
						for(int i = 0; i < 2; i++) {
								ans = ans * temp[i];
							}
							ps.println(ans);
							break;
				case '/' : ans = temp[0]; 
						for(int i = 1; i < 2; i++) {
								ans = ans / temp[i];
							}
							ps.println(ans);
							break;
				case '#' : System.exit(0);
				}
			
		} catch (IOException e) {
			System.out.println("Something went wrong with the input and output stage.");
			e.printStackTrace();
		}
		

	}

}
