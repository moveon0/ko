package ex3_lamda;

public class Calculator3 {
	public static void main(String[] args) {
		
		//람다식을 메서드의 매개변수로 사용하기
		MyCalculator calc = (num1,num2) -> num1 +num2;
		int result = myCalc(calc);
		
		System.out.println(result);
		
		int result2 = myCalc((num1,num2) -> num1 + num2);
		
		System.out.println(result2);
	}
	
	static int myCalc(MyCalculator calc) {
		return calc.plus(1, 2);
	}
}
