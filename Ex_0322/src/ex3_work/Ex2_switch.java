package ex3_work;
import java.util.Scanner;
public class Ex2_switch {
	public static void main(String[] args) {
		//두 개의 값 입력받기
		//산술연산자 기호를 문자열로 입력받기.
		//switch문을 이용해 정수의 연산을 수행하는 코드 작성하기
		
		//예시
		//수1 : 10
		//수2 : 7
		//연산자 : +
		
		//결과
		//10 + 7 = 17
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫 번째 수를 입력하세요 : ");
		int a = s.nextInt();
		System.out.println("두 번째 수를 입력하세요 : ");
		int b = s.nextInt();
		
		System.out.println("연산자를 입력하세요 : ");
		char c = s.next().charAt(0) ;
		
		switch (c) {
		
		case '+':
			System.out.printf("두 수의 덧셈은 %d입니다.\n",a+b);
			break;
		case '-':
			System.out.printf("두 수의 뺄셈은 %d입니다.\n",a-b);
			break;
		case '*':
			System.out.printf("두 수의 곱셈은 %d입니다.\n",a*b);
			break;
		case '/':
			System.out.printf("a를 b로 나눈 값의 몫은 %d입니다.\n",a/b);
			break;
		case '%':
			System.out.printf("a를 b로 나눈 값의 나머지는 %d입니다.\n",a%b);
			break;
			
		}
		
		//정수형 변수를 하나 입력받고 (1~12)
		//해당 달의 일수를 switch문을 통해 작성하세요
		//단 break는 3번만 사용할 것
	}
	
}
