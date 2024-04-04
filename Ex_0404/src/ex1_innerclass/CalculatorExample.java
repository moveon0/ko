package ex1_innerclass;


class Calculator{
	private int val1;
	private int val2;
	
	public Calculator(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	
	//인스턴스 클래스
	public class Calc{
		public int add() {
			return val1 + val2;
		}
	}
}
public class CalculatorExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator(10,11);
		Calculator.Calc c = cal.new Calc();
		
		System.out.println("합 : " +c.add());
	}
}

//-정적 내부 클래스(static class)
// .클래스 안에 정적 변수를 선언할 수 있는 것처럼 클래스도 정적 클래스를 만들 수 있다.
//필드와 마차가지로 static 키워드를 사용해 클래스를 선언한 후 정적 내부 클래스를 생선한다
//주로 외부 클래스의 static메서드에서 사용할 목적

//public class Outer{
	/*	public static class Inner{
	 * 			private STRING name;
 * 	}
}
 * 외부 클래스의 필드 또는 메서드를 내부 클래스 안에서 사용할 수 없다.
 */
