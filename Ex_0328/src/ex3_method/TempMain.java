package ex3_method;
import java.util.Scanner;
public class TempMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TempMethod tm = new TempMethod();
		System.out.println("섭씨를 화씨로 바꾸려면 1을 화씨를 섭씨로 바꾸려면 2를 눌러주세요:");
		
		int c= sc.nextInt();
		
		switch(c) {
		case 1:
			
			System.out.println("섭씨를 화씨로 바꾼 온도: "+tm.celsiusToFahrenheit());
			break;
		case 2:
			System.out.println("화씨를 섭씨로 바꾼 온도: "+tm.fahrenheitToCelsius()); 
			break;
		}
		
		
		
	}
}
