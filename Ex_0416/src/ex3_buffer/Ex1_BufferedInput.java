package ex3_buffer;
//ㄴ
import java.io.BufferedInputStream;
import java.io.FileInputStream;


public class Ex1_BufferedInput {
	public static void main(String[] args) {
	FileInputStream in = null;
	BufferedInputStream bis = null;
	
	try {
		in = new FileInputStream("C:\\web1900_yyj\\1.java\\work\\ko\\test.txt");
		bis = new BufferedInputStream(in);
		
		int code = 0;
		while((code = bis.read()) != -1) {
			System.out.print((char)code);
		}
		
		bis.close();
		in.close();
	} catch (Exception e) {
		// TODO: handle exception
	}
	}	
	
}
