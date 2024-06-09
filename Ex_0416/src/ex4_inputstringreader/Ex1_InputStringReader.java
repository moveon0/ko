package ex4_inputstringreader;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Ex1_InputStringReader {
	public static void main(String[] args) {
		FileInputStream in = null;
		InputStreamReader is = null;
		
		try {
			in = new FileInputStream("C:\\web1900_yyj\\1.java\\work\\ko\\test.txt");
			is = new InputStreamReader(in,"UTF-8");
			
			int read = 0;
			while((read = is.read()) != -1) {
				System.out.print((char)read);
			}
			is.close();
			in.close();
			
		} catch (Exception e) {
			// TODO: handle exceptionㄴ
		}
	}
}
