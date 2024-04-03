package ex7_phone;
//인터페이스

/*
* 모든 메서드가 추상메서드인 추상클래스를 '인터페이스'라고 한다.
* 인터페이스는 추상 메서드와 상수로만 이루어져 있으며
* 추상클래스와 마찬가지로 스스로 객체를 생성할 수 없다.
* 추상 클래스와 같은 역할을 하는 것처럼 느껴질 수 있지만
* 추상클래스는 자식클래스들의 공통적인 특징을 추출하고 제공하는 것이 주된 역할이였다면
* 인터페이스는 그뿐 아니라 다른 클래스 코드들과 중간 매개 역할을 하는 것을 중점으로 할 수 있다.
*/
public interface Phone {
	public static int MAX_BATTERY_CAPACITY = 100;
	
	 void powerOn();
	 void powerOff();
	 boolean isOn();
	 void watchUtube();
	 void charge();
}
