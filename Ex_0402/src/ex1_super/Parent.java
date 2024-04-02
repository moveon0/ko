package ex1_super;
//상속에서의 생성자
/*
 * -생성자
 * 객체를 메모리에 올리는 역할을 하는 특수한 기능을 가진 메서드
 * 생성자를 정의하지 않으면 컴파일러가 기본생성자를 만들어준다.
 * --접근 제한자 클래스명(매개변수)--{
 * }
 * 
 * 생성자의 호출은 객체를 생성할 때 한 번만 호출하고 다시 호출이 불가능하다.
 * 클래스명 변수명 = new 클래스명(값);
 * 
 * -상속에서의 생성자
 * 모든 클래스에는 생성자가 있다.
 * 상속관계에서 부모클래스의 생성자와 자식클래스의 생성자는 어떻게 사용해야 할까
 * 
 * -super
 * super키워드는 부모클래스로부터 상속받은 필드나 메서드를 자식클래스에서 참조하는 데 사용하는 키워드
 * 부모클래스의 멤버와 자식 클래스의 멤버 이름이 같을 때 super키워드로 구분할 수 있다.
 * 
 * this가 같은 클래스의 다른 생성자를 호출할 때 사용된다면 
 * super()메서드는 부모클래스를 호출하는데 사용
 * 
 */
public class Parent {
	public Parent(int n) {
		System.out.println("자식으로부터 받은 "+n+" 출력");
	}
	
	public int result() {
		return 100;
	}
}