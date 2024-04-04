package ex4_try_catch;
import java.util.Scanner;
public class Ex4_try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		
		try {
			 String a = sc.next();
			 a = Integer.parseInt(a);
			System.out.println("입력한 수 : "+a);
			
		} catch (Exception e) {
			System.out.println(a+"는 정수가 아닙니다");
		}
	}
}
