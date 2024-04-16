package ex1_File;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		String path = "C:\\Users\\윤영진";
		
		File f = new File(path);
		
		String[] names = new String[100];
		//isDirectory():최종 목적지가 폴더면 true, 아니면 false
		if(f.isDirectory()) {
			//list(): 경로의 하위 요소들의 이름을 String 배열에 저장
			String[] arr = f.list();
			for(String s : arr) {
				System.out.println(s);
			}
		}
		
		
	}
}
