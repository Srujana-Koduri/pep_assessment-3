package com.server_client.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	// Declaring the variables like port number ................ it should be same that declare in the client 
	public static int port = 9999;

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// Creating a successful serversocket with the port number...............
		ServerSocket serverSock = new ServerSocket(port);
		
		// Creating the server side socket that accepts that particular client with same port number.........
		Socket sock = serverSock.accept();
		
		// Make also a input stream
		BufferedReader br1 = new BufferedReader(new InputStreamReader(sock.getInputStream()));	// br1 object accepts the input from the client side socket.....
		
		// Make a output stream...............
		PrintStream ps = new PrintStream(sock.getOutputStream());	// ps object will send the data from the server -> client
		
		// Store the number from the client side..........
		int num = Integer.parseInt(br1.readLine());
		
		// Calculate the required calculation.............
		int temp = (int) Math.sqrt(num);	// This basically doing the square root operation on num and store it on temp......
		
		// Send the data to the client side................
		ps.println(temp);
	}

}