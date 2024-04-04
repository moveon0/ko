package ex4_try_catch;

import java.util.Scanner;

//문제
//키보드에서 정수를 입력받고 정수 이외의 값이 입력되면 "정수만 입력가능"이라는 메시지 출력하기
public class Ex3_try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("정수를 입력하세요 : ");
			int a=sc.nextInt();
			System.out.println("입력받은 수 : "+a);
		} catch (Exception e) {
			System.out.println("정수만 입력가능");
		}
	}
}
