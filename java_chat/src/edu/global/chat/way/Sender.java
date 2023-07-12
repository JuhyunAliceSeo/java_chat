package edu.global.chat.way;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender extends Thread {
	private Socket socket;
//	DataOutputStream out;
	private String name; 
	private DataOutputStream out;
	
	public Sender(Socket socket) {
		this.socket = socket;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			name = "[" + socket.getInetAddress() +":"+socket.getPort() +"]";
		} catch (Exception e) {
			
		}
	}
	public void run() {
		Scanner scanner = new Scanner(System.in);
		
		while(out != null) {
			try {
				out.writeUTF(name + scanner.nextLine());
			} catch (Exception e) {
				
			}
		}
	}

}
