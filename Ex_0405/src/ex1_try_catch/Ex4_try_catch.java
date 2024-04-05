package ex1_try_catch;

import java.util.Scanner;

public class Ex4_try_catch {
	public static void main(String[] args) {
		//강제 예외처리
		//프로그램을 작성하다 보면 코드의 오류로 발생하는 예외도 있지만
		//프로그램의 규칙에 위배되어 예외를 발생시켜야 하는 경우도 있다.
		//만약 프로그램의 규칙에 위배되어 예외를 발생해야 할 경우
		//강제로 예외를 발생시킬 수 있다.
		
		Scanner sc = new Scanner(System.in);
		
		int val = 0;
		
		while (true){
			try {
				System.out.println("숫자를 입력하세요(0~50) : ");
				val = sc.nextInt();
				
				if ( val == -1) {
					break;
				}
				
				if ( val < 0 || val > 50) {
					throw new Exception("숫자의 허용범위가 아닙니다.");// 문자열이 Exception 클래스의 detailmessage로 대입
				}
			} catch (Exception e) {
				System.out.println("에러 메시지 : "+ e.getMessage());//e.getMessage로 반환
			}
		}	
		System.out.println("프로그램 종료");
		}
}
