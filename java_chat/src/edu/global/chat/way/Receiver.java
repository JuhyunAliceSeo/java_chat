package edu.global.chat.way;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Receiver extends Thread {
	
	private Socket socket;
//	DataOutputStream out;
//	String name; 
	private DataInputStream in;
	
	public Receiver(Socket socket) {
		this.socket = socket;
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch (Exception e) {
			
		}
	}
	public void run() {
		while(in != null) {
			try {
				System.out.println(in.readUTF());
			} catch (Exception e) {
				
			}
		}
	}

}
