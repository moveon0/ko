package ex1_filereader;

import java.io.FileReader;

//text.txt에 아무 내용이나 적는다. 한글, 영어 대소문자
//섞어 작성하고 test.txt의 내용을 읽어와서
//영어 대문자와 소문자의 개수를 출력

//대문자 : x개
//소문자 : x개
public class Ex2_FileReader {
	public static void main(String[] args) {
		/*try {
			FileReader fr =new FileReader("C:\\\\web1900_yyj\\\\1.java\\\\work\\\\ko\\\\test.txt");
			int code = 0;
			int c1 = 0;
			int c2 = 0;
			while((code=fr.read()) != -1) {
				if (code >= 65 && code <= 90) {
					c1++;
				}  else if(97 <= code && code <= 122){
					c2++;
				}
				
			}
			
			
			
			fr.close();
			System.out.println("대문자 : "+c1+"개");
			System.out.println("소문자 : "+c2+"개");
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		
		//강사님 풀이
		
		int upper = 0;
		int lower = 0;
		
		try {
			FileReader fr = new FileReader("C:\\\\web1900_yyj\\\\1.java\\\\work\\\\ko\\\\test.txt");
			int code = 0;
			while((code = fr.read()) != -1) {
				if(code >='A' && code <= 'Z') {
					upper++;
				} else if(code >='a' && code <= 'z') {
					lower++;
				}
			}
			System.out.println("대문자 : "+upper+"개");
			System.out.println("소문자 : "+lower+"개");
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
