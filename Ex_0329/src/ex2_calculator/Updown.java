package ex2_calculator;
import java.util.Scanner;
import java.util.Random;
public class Updown {
	Random random = new Random();
	int target = random.nextInt(50)+1;
	
	public int Updown() {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(true) {
			System.out.print("정수를 입력하세요 : ");
			int n = sc.nextInt();
			if (n > target) {
				System.out.println("틀렸습니다.");
				System.out.println("down!");
			} else if ( n < target) {
				System.out.println("틀렸습니다.");
				System.out.println("up!");
			} else if (n == target) {
				System.out.println("정답!");
				return count;
				
				
			}
			count +=1;
		}
		
	}
}
