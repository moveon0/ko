package Chat2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.out.println("사용법 : java.com.example.chat2.ChatClient 닉네임");
			return;
		}
		String name = args[0];
		Socket socket = new Socket("127.0.0.1", 10019);

		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

		// 닉네임 전송
		pw.println(name);
		pw.flush();
		
		
		// 백그라운드 서버가 보내준 메시지를 읽어들여서 화면에 출력한다..
		InputThread inputThread = new InputThread(br);
		inputThread.start();

		// 클라이언트는 읽어들인 메시지를 서버에 전송한다.
		try {
			String line = null;
			while ((line = keyboard.readLine()) != null) {
				if("/quit".equals(line)) {
					pw.println("/quit");
					pw.flush();
					break; // while문을 빠져나간다.
				}
				pw.println(line);
				pw.flush();
			}

		} catch (Exception e) {
			System.out.println("...");
		}
		
		try {
			br.close();
		} catch (Exception e) {
			System.out.println("111");
		}
		
		try {
			pw.close();
		} catch (Exception e) {
			System.out.println("222");
		}
		
		try {
			socket.close();
			
		} catch (Exception e) {
			System.out.println("333");
		}
	}
}

class InputThread extends Thread {
	BufferedReader br;

	public InputThread(BufferedReader br) {
		this.br = br;
	}

	@Override
	public void run() {
		try {
			String line = null;
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (Exception e) {
			System.out.println("...");
		}
	}
}