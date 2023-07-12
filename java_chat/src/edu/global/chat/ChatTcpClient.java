package edu.global.chat;

import java.net.ServerSocket;
import java.net.Socket;

public class ChatTcpClient {
	
	public static void main(String[] args) {
		String serverIP = "127.0.0.1";
		
		Socket socket = null;
		
		try {
			
			socket = new Socket(serverIP,8888);
			System.out.println("서버에 연결되었습니다.");
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}	

}
