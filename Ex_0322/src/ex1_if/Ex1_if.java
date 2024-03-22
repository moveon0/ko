package ex1_if;

import java.util.Scanner;

public class Ex1_if {
	public static void main(String[] args) {
		//단순 if문
		//기본형 
		//if(조건식){
		//	조건식이 참일 때 실행할 명령;
		//}
		
		//실행해야 하는 명령이 한 줄이라면 중괄호 생략 가능.
		//if(조건식) 조건식이 참일 때 실행할 문장;
		
		//조건식에는 논리형으로 결과를 확인할 수 있는 모든 식을 넣을 수 있다.
		//조건식의 값이 true라면 코드블럭 안의 명령을 실행한다.
		
		int result = 0;
		
		if(3>2) result = 3;
		
		System.out.println(result);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요 : ");
		int age = scan.nextInt();
		
		if(age > 19) {
			System.out.println("성인입니다.");
		}
		System.out.println("프로그램을 종료합니다.");
		
	}
}
