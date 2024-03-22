package ex3_work;
import java.util.Scanner;
public class Ex1_if {
	public static void main(String[] args) {
		//키보드에서 값을 입력받아
		//짝수면 x는 짝수입니다.
		//홀수면 x는 홀수입니다. if문 이용해 작성
		
		Scanner s = new Scanner(System.in);
		System.out.println("값을 입력하세요 : ");
		int x = s.nextInt();
		
		if (x%2==0) {
			System.out.println(x+"는 짝수입니다.");
		} else {
			System.out.println(x + "는 홀수입니다.");
		}
		
		System.out.println("-------------");
		
		//국어 영어 수학 점수를 입력받고
		//한 과목이라도 40점을 넘지 못하면
		//불합격을 출력하고
		//세 과목 모두 40점을 넘으면 합격을 출력하세요
		System.out.println("점수를 입력하세요 : ");
		int kor = s.nextInt();
		int eng = s.nextInt();
		int mat = s.nextInt();
		
		if (kor >= 40 && eng >= 40 && mat >= 40) {
			System. out.println("합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		
		
	}
}
