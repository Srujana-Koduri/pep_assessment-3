package com.server_client.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	// Declaring the variables like ip address and the port number.............
	// port number basically make the connection between server and particular client...........
	// ip address denotes the particular machine on which server works..............
	public static String ip = "localhost";
	public static int port = 9999;

	@SuppressWarnings("resource")
	public static void main(String[] args) throws UnknownHostException, IOException {
		// Creating the client side socket with port number and ip address..................
		Socket sock = new Socket(ip, port);
		
		// making the object that accepts the inputs.................
		// Here I am using InputStreamReader and BufferedReader.................
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));	// br1 basically accepts the inputs from the user.......
		BufferedReader br2 = new BufferedReader(new InputStreamReader(sock.getInputStream()));		// br2 basically accepts the input from the server side socket.......
		
		// making an output stream that will send the data from client to server.........
		// Here I am using PrintStream
		PrintStream ps = new PrintStream(sock.getOutputStream());		// ps object will send the data from client -> server......
		System.out.print("Enter the number to check : ");
		// Scan the number 
		int num = Integer.parseInt(br1.readLine());
		
		// Sending that number to the server side ............ using .println() method.
		ps.println(num);
		
		// Receiving the answer from the server side .............and print it.....
		int ans = Integer.parseInt(br2.readLine());
		System.out.print("The required result is : " + ans);
	}

}
