package ex4_try_catch;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ex4_try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		
		
		
		try {
			int num = sc.nextInt();
			System.out.print("입력한 수 : "+num);
			
		} catch (InputMismatchException e) {
			String input = sc.next();
			System.out.println(input+"는 정수가 아닙니다");
		}
		
		//강사님풀이
		
		System.out.println("정수 : ");
		String str = "";
		try {
			str = sc.next();
			int num = Integer.parseInt(str);//변환값을 num에 넣음
			System.out.println("결과 : "+num);
		} catch(Exception  e) {
			System.out.println("결과 : "+str+"은 정수가 아닙니다.");
		}
	}
}
