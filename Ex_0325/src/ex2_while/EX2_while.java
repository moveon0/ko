package ex2_while;
import java.util.Scanner;
public class EX2_while {
	public static void main(String[] args) {
		//while문
		//간편한 구성을 가짐
		//반복횟수가 정해져 있지 않고 조건식이 true면 계속 반복
		//for문보다 구조가 간단하지만 주의하지 않으면 무한루프에 빠질 수 있음.
		
		//키보드에서 값을 받고 -1입력 시 종료
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while(n != -1) {
			System.out.println("정수 입력 : ");
			n = sc.nextInt();
			System.out.println("입력한 숫자는 : "+n);
		}
		//while문은 몇 번을 반복할 지 정확하지 않을 때 사용
	}

}
