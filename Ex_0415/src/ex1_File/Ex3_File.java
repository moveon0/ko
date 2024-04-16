package ex1_File;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
		String path = "C:\\Users\\윤영진/aaa/bbb";
		
		File f = new File(path);
		
		//경로로 접근하는 중 정상적으로 파일이나 폴더가 존재하면 true 아니면 false
		if(!f.exists()) {
			System.out.println("폴더생성");
			//mkdir(): 폴더생성 메서드 2개 이상은 못 만듦
			f.mkdirs();//하나여도 만들 수 있고 복수도 생성 가능
			
		}
		//코드를 통해 자동으로 목적지를 만들어줌
		//실제로 많은 프로그램들이 이런 기능을 가진 클래스들을 가지고 있다.
		//하지만 파일을 만드는 기능은 없다.
	}
}
