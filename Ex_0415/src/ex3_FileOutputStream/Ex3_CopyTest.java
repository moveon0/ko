package ex3_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Ex3_CopyTest {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("C:\\Users\\윤영진\\wall1.jpg");
			out = new FileOutputStream("C:\\Users\\윤영진\\wall1_copy.jpg");
			byte[] buffer = new byte[512];
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			int read= 0;
			while((read = in.read(buffer))!= -1) {
				out.write(buffer,0,read);
			}
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			
			double time = (double)(end-start)/1000;
			System.out.println(time+"초");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(out!=null) {
					out.close();
				}
				if( in != null) {
					in.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	
	}
}
