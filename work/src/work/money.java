package work;
import java.util.Scanner;
public class money {
	public static void main(String[] args) {
		//돈 입력받고 필요한 최소의 동전 수 구하기
		int [] coin = {500,100,50,10};
		
		System.out.println("금액을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();// 입력받기
		
		int count = 0;//동전 개수 세기
		
		for (int i = 0; i < coin.length; i++) {
			if (money / coin[i] != 0) {//현재 단위로 나눠지면 동전 개수 추가 안나눠지면 다음 단위로..
				count += money/coin[i]; //동전 개수 추가
				money -= money-(money % coin[i]);//남은 금액
			} else {
				continue;//다음 단위로
			}
		}
		System.out.printf("동전의 개수는 %d개입니다.",count);
	}
}
