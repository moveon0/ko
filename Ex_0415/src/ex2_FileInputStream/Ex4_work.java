package ex2_FileInputStream;
//특정 경로에 file.txt문서를 만들고 아무 문장이나 입력한다.
//file.txt의 내용을 FileInputStream으로 읽어온 뒤 ,
//이 값이 회문인지 판별하시오
import java.io.File;
import java.io.FileInputStream;
public class Ex4_work {
	public static void main(String[] args) {
		
		/*String path = "C:\\Users\\윤영진\\file.txt";
		File f = new File(path);
		
		byte[] read = new byte[(int)f.length()];
		FileInputStream fis= null;
		
		if(f.exists()) {
			try {
				fis= new FileInputStream(f);
				
				fis.read(read);//파일을 읽어와서 read배열에 넣기 때문에 반복문 안씀
				
				String res = new String(read);
				String res1 = res;
				if(res.equals(res1)) {
					System.out.println("회문입니다.");
				}
				else {
					System.out.println("회문이 아닙니다.");
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				try {
					fis.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}*/
		
		//강사님풀이
		
		String path = "C:\\Users\\윤영진\\file.txt";
		File f = new File(path);
		
		byte [] read = new byte[(int)f.length()];
		try {
			FileInputStream fis = new FileInputStream(path);
			
			fis.read(read);
			
			String ori = new String(read);
			
			StringBuilder rev = new StringBuilder(ori).reverse();
			String reverse = new String(rev);
			
			if(ori.equals(rev.toString())) {
				System.out.println(ori+"는 회문입니다.");
			}
			else {
				System.out.println(ori+"는 회문이 아닙니다");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
