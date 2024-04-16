package ex2_FileInputStream;

import java.io.File;
import java.io.FileInputStream;

public class Ex2_FileInputStream {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\윤영진\\test.txt";
		
		File f = new File(path);
		byte[] read = new byte[(int)f.length()];
		FileInputStream fis = null;
		if(f.exists()) {
			try {
				fis= new FileInputStream(f);
				
				fis.read(read);//파일을 읽어와서 read배열에 넣기 때문에 반복문 안씀
				
				String res = new String(read);
				
				System.out.println(res);//배열의 크기를 100으로 줫어서 남은 크기만큼 네모
				
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				try {
					fis.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
}
