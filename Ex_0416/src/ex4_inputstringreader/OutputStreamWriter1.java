package ex4_inputstringreader;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriter1 {
	public static void main(String[] args) {
		FileOutputStream out = null;
		OutputStreamWriter is = null;
		
		try {
			out = new FileOutputStream("C:\\web1900_yyj\\1.java\\work\\ko\\test2.txt");
			is = new OutputStreamWriter(out);
			
			System.out.println("파일 생성 시작");
			
			String[] strArray = {"OutputStreamWriter에 대해 배웁니다.",
								"we are learining about OutputStreamWriter"};
			
			for(String s: strArray){
				is.write(s);
			}
			is.close();
			out.close();
		} catch (Exception e) {
			// TODO: handle exceptionㄴ
		}
	}
}
