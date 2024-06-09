package Chat2;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatServer {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket(10019);
		List<ChatThread> list = Collections.synchronizedList(new ArrayList<>());//동시에 접근 못하게
		
		while(true) {
			Socket socket = serverSocket.accept();//클라이언트 접속됨
			ChatThread chatClient = new ChatThread(socket, list);
			chatClient.start();
		}//while
	}//main
}
