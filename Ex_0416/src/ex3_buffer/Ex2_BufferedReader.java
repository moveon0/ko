package ex3_buffer;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex2_BufferedReader {
	public static void main(String[] args) {
		//문자 기반의 보조스트림의 경우 버퍼에 데이터를 저장하여
		//입력 또는 출력하기 때문에 한 단어 뿐만 아니라 문장 단위로데이터를
		//읽거나 쓸 수 있다.
		FileReader reader = null;
		BufferedReader br = null;
		
		try {
			reader = new FileReader("C:\\web1900_yyj\\1.java\\work\\ko\\test.txt");
			br = new BufferedReader(reader);
			
			//문장을 저장할 변수
			String str = "";
			
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
			br.close();
			reader.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
