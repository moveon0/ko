package ex3_method;
import java.util.Scanner;
public class TempMethod {
	//main에서 섭씨로 변화하고 싶으면 1, 화씨로 변경하고 싶으면 2를 입력받고
	//fahrenheitToCelsius함수를 통해 화씨를 섭씨로, celsiusToFahrenheit함수를 통해 
	//온도를 입력받고 섭씨를 화씨로 바꿔 출력하는 프로그램 만들기
	
	//화씨 = 1.8 * 섭씨 + 32;
	//섭씨 = (화씨 - 32) / 1.8;
	
	Scanner sc = new Scanner(System.in);
	public void start() {
		System.out.println("번호를 선택하세요 : ");
		int n = sc.nextInt();
		switch(n) {
		case 1:
			
			fahrenheitToCelsius(sc);
			break;
		case 2:
			celsiusToFahrenheit(sc); 
			break;
	}}
	
	
	public void fahrenheitToCelsius(Scanner sc) {
		double father;
		double cel;
		
		System.out.println("화씨를 입력하세요 : ");
		father = sc.nextInt();
		
		cel = (father - 32) / 1.8;
		
		System.out.println("섭씨로 변화된 온도는 "+cel + "도입니다.");
		
	}
	
	public void celsiusToFahrenheit(Scanner sc) {
		double cel;
		double father;
		
		System.out.println("섭씨를 입력하세요 : ");
		cel = sc.nextInt();
		
		father = 1.8 * cel + 32;
		
		System.out.println("화씨로 변화된 온도는 "+father + "도입니다.");
	}
	
	
}
