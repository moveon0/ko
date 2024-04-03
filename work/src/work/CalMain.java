package work;
//Calculator클래스를 만들고
//반환형은 정수, 매개변수는 정수형 변수 n1, n2, 반환값은 -1인
//getResult()함수를 정의하세요
//CalPlus 클래스를 만들고 Calculator를 상속받으세요
//오버라이딩하여 getResult()를 n1과 n2를 더하여 반환하는 메서드로 만든다.
//CalMinus클래스를 만들고 Calculator를 상속받으세요
//오버라이딩하여 getResult()를 n1과 n2를 빼서 반환하는 메서드로 만든다.
public class CalMain {
	public static void main(String[] args) {
		CalPlus cp = new CalPlus();
		CalMinus cm = new CalMinus();
		Calculator c = new Calculator();
		
		System.out.println(cp.getResult(3, 3));
		System.out.println(cm.getResult(3, 3));
		System.out.println(c.getResult(3, 3));
	}
}
