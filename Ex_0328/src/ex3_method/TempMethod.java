package ex3_method;
import java.util.Scanner;
public class TempMethod {
	//main에서 섭씨로 변화하고 싶으면 1, 화씨로 변경하고 싶으면 2를 입력받고
	//fahrenheitToCelsius함수를 통해 화씨를 섭씨로, celsiusToFahrenheit함수를 통해 
	//온도를 입력받고 섭씨를 화씨로 바꿔 출력하는 프로그램 만들기
	
	//화씨 = 1.8 * 섭씨 + 32;
	//섭씨 = (화씨 - 32) / 1.8;
	Scanner sc = new Scanner(System.in);
	
	public double fahrenheitToCelsius() {
		System.out.println("온도를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		double temp = sc.nextDouble();
		return (temp - 32) / 1.8;
	}
	
	public double celsiusToFahrenheit() {
		System.out.println("온도를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		double temp = sc.nextDouble();
		return 1.8 * temp + 32;
	}
	
	
}
