package ex_1for;
import java.util.Scanner;
public class Ex1_for {
	public static void main(String[] args) {
		//정수형 변수 dan에 1~9 사이의 수를 초기화한다.
		//dan에 해당하는 구구단 출력하기
		//2 x 1 = 2
		//2 x 2 = 4
		//...
		//2 x 9 = 18
		
		Scanner s = new Scanner(System.in);
		/*System.out.println("정수를 입력하세요 : ");
		int dan = s.nextInt();
		
		for (int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan * i);
		}
		*/
		//키보드에서 정수를 입력받는다.
		//1부터 입력받은 정수까지의 합을 계산해 출력
		//ex) 5를 입력받았다면 1+2+3+4+5의 연산결과인 15를 출력
		
		/*System.out.println("정수를 입력하세요 : ");
		int num = s.nextInt();
		int count = 0;
		for (int i = num; i > 0; i--) {
			count += i;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.",num,count);
		*/
		
		//10개의 정수를 입력받고 짝수가 몇 개인지 출력
		
		int even = 0;
		
		for (int i=0; i<10; i++) {
			System.out.println("정수를 입력하세요 : ");
			int num = s.nextInt();
			
			if (num % 2 ==0){
				even +=1;
			}
		}
		System.out.printf(" 짝수의 개수는 %d개입니다.",even);
	}
}
