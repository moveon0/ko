package ex3_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex2_CopyTest {
	public static void main(String[] args) {
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("C:\\Users\\윤영진\\wall.png");
			out = new FileOutputStream("C:\\Users\\윤영진\\wall_copy.png");
			
			//currentTimemillis() : 현재 시간을 m/s단위로 나타냄
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			
			int read = 0;
			while((read = in.read())!= -1) {
				out.write(read);
			}
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			
			long time = (end-start)/1000;
			System.out.println(time+"초");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
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
