package ex1_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * -예외 던지기
 * 
 * 메서드 내부에서 예외를 직접 처리하지 않고 미룬 후 해당 메서드를 호출한 쪽에서 예외를 처리하는 방법
 * 때로는 직접 처리하는 것보다 해당 메서드를 사용한 곳에서 처리하는 것이 효율적이다.
 * 
 * thorws 키워드를 사용한다.
 * 
 * 메서드의 ()뒤에서 throws 키워드를 사용해 던지기를 할 예외 객체를 붙여주면 된다.
 * 예외 객체는 여러 개를 선언할 수 있으며 여러 개를 선언할 때는 콤마(,)로 구분하여 나열한다.
 */ 
public class ThrowsEceptionExample {
	public static void checkYourSelf(Scanner scan) throws InputMismatchException{
		System.out.println("1. 사람과 어울리는 것이 좋다. 2. 혼자 있는 것이 좋다.");
		System.out.print("선택 : ");
		int check = scan.nextInt();
		
		if(check ==1) {
			System.out.println("당신은 E입니다.");
		} else {
			System.out.println("당신은 I입니다.");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("===== 성격 유형 검사를 시작합니다. =====");
			//메서드 호출
			ThrowsEceptionExample.checkYourSelf(sc);//정적 메소드여서 가능
		} catch (InputMismatchException e) {
			System.out.println("키보드 입력이 잘못되었습니다.");
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}
