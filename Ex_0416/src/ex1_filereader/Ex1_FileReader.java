package ex1_filereader;

import java.io.FileReader;

public class Ex1_FileReader {
	public static void main(String[] args) {
		try {
			FileReader fr =new FileReader("C:\\\\web1900_yyj\\\\1.java\\\\work\\\\ko\\\\test.txt");
			int code = 0;
			
			while((code=fr.read()) != -1) {
				System.out.print((char)code);//한글도 알아서 처리해줌
			}
			
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
