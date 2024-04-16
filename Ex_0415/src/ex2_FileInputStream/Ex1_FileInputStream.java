package ex2_FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1_FileInputStream {
	public static void main(String[] args) {
		String path = "C:\\Users\\윤영진\\test.txt";
		
		File f = new File(path);
		
		if(f.exists()) {
			try {
				FileInputStream fis = new FileInputStream(f);
				
				int code = 0;
				
				while ((code = fis.read()) != -1){
					System.out.print((char)code);
				}
				//스트림은 사용이 완료된 이후 close를 통해 닫아주는 것이 좋다.
				//그래야 다음 작업을 하는 데 문제가 생기지 않는다.
				fis.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
