package ex1_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2_finally {
	public static void main(String[] args) {
		//finally
		//예외 발생 유무와 상관 없이 실행되는 구문이며 생략 가능하다
		//예외 처리를 할 때 예외와 상관없이 반드시 처리해야하는 구문들을
		//작성할 때 사용하면 좋다.
		//보통 외부 연동이나 예외가 발생해도 정상 종료되어야 할 구문들에서 사용한다.
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("점수를 입력하세요 : ");
			int score = sc.nextInt();
			
			if(score >= 60) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		} catch (InputMismatchException e) {
			System.out.println("키보드 입력이 올바르지 않습니다.");
		}finally {
			System.out.println("프로그램 종료");
		}
	}
}

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
