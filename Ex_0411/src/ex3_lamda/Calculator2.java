package ex3_lamda;

public class Calculator2 {
	public static void main(String[] args) {
		MyCalculator calc= (num1, num2) ->num1 + num2;
		
		//::(이중콜론) : 메서드 참조 연산자
		//람다식을 보다 간결하게 사용할 수 있게 해줌
		MyFunction myFunction = System.out::println;
		
		myFunction.method(10);
	}
	
}
