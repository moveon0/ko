package ex2_annoymous;

public class PersonMain {
	public static void main(String[] args) {
		Student s = new Student();
		s.myself();
		
		//생성자 뒤에 코드블럭이 추가되고, 해당 클래슥 ㅏ가진 메서드들을
		//오버라이딩하여 구현하는 방법이다.
		//해당 클래스 자체를 재정의하여 구현한다.
		//구현된 마지막 문법에는 세미콜론 ; 을 붙인다.
		//익명 클래스는 보통 인터페이스의 기능을 구현할 때 사용한다.
		//인터페이스를 클래스 파일을 만들어 직접 구현하는 게 아니라
		//익명클래스로 선언하여 기능을 직접 구현한다.
		Person p2 = new Person() {
			@Override
			public void myself() {
				System.out.println("저는 직장인입니다.");
			}
		};
		p2.myself();
	}
}
