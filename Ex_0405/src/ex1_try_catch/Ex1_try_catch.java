package ex1_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1_try_catch {
	public static void main(String[] args) {
		//다중 catch 사용하기
		//프로그램이 구동될 때 하나의 예외만 발생한다면 처리하기는 수비다.
		//다만 try안에서 예외는 다양하게 발생할 수 있다.
		//모든 예외를 상속하는 Exception 으로 처리하거나
		//각각의 예외를 처리할 수 있도록 catch구문을 여러 개 만들어야 한다.
		
		Scanner sc = new Scanner(System.in);
		
		try {
			int[] cards = {4,5,1,2,7,8};
			System.out.println("몇 번째 카드를 뽑으시겠습니까? ");
			
			int cardIndex = sc.nextInt();
			System.out.println("뽑은 카드 번호는 : "+ cards[cardIndex]);
		} catch(InputMismatchException e) {
			System.out.println("잘못 입력하셨습니다. 정수만 입력하시오.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("해당 번호의 카드는 없습니다.");
		}
		System.out.println("프로그램 종료");
	}
}
