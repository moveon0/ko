package ex2_filewriter;
//Output과 FileWriter의 특징: 확장자를 마음대로 설정할 수 있다.ㄴ
import java.io.FileWriter;

public class Ex1_FileWriter {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\web1900_yyj\\1.java\\work\\ko\\test1.txt",true);
			
			fw.write("첫 번째 줄 작성하기\n");
			fw.write("두 번째 줄 작성하기\n");
			
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
