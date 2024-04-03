package ex1_calender;
//자식 객체의 메서드가 먼저 호출되는 이유
/*
 * 메서드가 실행 시점에서 성격이 결정되는 동적바인딩 때문이다.
 * 프로그램의 컴파일 시점에 부모 클래스는 자신의 멤버함수밖에 접근할 수 없으나
 * 실행 시점에서 동적 바인딩이 일어나 부모가 자식 클래스의 멤버 함수를 접근하여 실행할 수 있다.
 * 
 * -동적 바인딩의 작동
 * 
 * 1. 클래스의 계층구조
 * 자바에서 동적바인딩은 클래스 계층 구조에서 발생한다.
 * 상속하거나 인터페이스를 구현함으로써 계층을 갖는다.
 * 이 계층에서 오버라이딩이 가능하기 때문이다.
 * 
 * 2. 메서드 오버라이딩
 * 자식 클래스는 부모 클래스의 메서드를 재정의할 수 있다.
 * 자식클래스에서 부모 클래스의 동일한 함수명, 매개변수를 가진 메서드를 재정의한다.
 * 
 * 3. 실행시 동적 바인딩
 * 객체가 생성되고 메서드가 호출될 때 실제로 실행될 메서드는 객체의 실제 타입에 따라 결정된다.
 * 메서드 호출 시 객체의 클래스 타입을 기반으로 어떤 메서드를 호출할 지 동적으로 결정된다.
 */
public class Calendar {
	String color;
	int months;
	
	public Calendar(String color, int months) {
		this.color = color;
		this.months = months;
	}
	
	public void info() {
		System.out.println(color+"달력은 "+months+"월 까지 있습니다.");
	}
	
	public void hanging() {
		System.out.println(color+"달력을 벽에 걸 수 있습니다.");
	}
	
	
	
}

