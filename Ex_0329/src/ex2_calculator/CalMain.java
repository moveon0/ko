package ex2_calculator;
import java.util.Scanner;
//CalTest클래스를 생성하고
//두 개의 정수와 산술연산자를 매개변수로 갖는 getResult라는 메서드를 정의 
//main에서 숫자와 산술연산자를 전달하고 결과 확인하기
public class CalMain {
	public static void main(String[] args) {
		CalTest ct = new CalTest();
		double result = ct.getResult(5, 4, '+');
		
		System.out.println("두 수의 산술결과는 : "+result);
		
		ct.getResult1(19, 7, "-");
	}
}
