package ex2_calculator;
import java.util.Scanner;
//Updown 클래스를 생성하고 1 ~ 50 사이의 난수를 발생시킨다.
//Main 클래스에서 키보드를 통해 정수를 입력받는다.
//Updown 클래스에서 사용자가 입력한 숫자를 판단하여
//발생한 난수보다 크다면 down!, 작다면 up!을 출력
//사용자가 입력한 숫자와 발생한 난수가 같다면 프로그램을 종료
//정답을 맞춘 경우 프로그램의 종료는 Main에서 이루어지도록 함

//몇 회만에 맞췄는 지 출력

//Random클래스
//Random random = new Random();
//random.nextInt(50)+1
public class UpdownMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Updown ud = new Updown();
		int updown=ud.Updown();
		System.out.println(updown+"회 만에 맞혔습니다.");
		
		
		//강사님 풀이
		
		while(true) {
			System.out.print("숫자입력 : ");
			int answer = ud.check(sc.nextInt());
			if( answer == 1) {
				System.out.println("정답!");
				break;
			} else if(answer == 2) {
				System.out.println("up!");
			} else {
				System.out.println("down!");
			}
		}
		
		
	}
}
