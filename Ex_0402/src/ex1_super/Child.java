package ex1_super;

public class Child extends Parent{
	public Child(int n) {
		super(n);//부모클래스 생성자 호출
		//부모클래스의 생성자가 매개변수를 갖기 시작하면
		//super()를 생략할 수 없다.
		System.out.println("자식(Child)클래스 생성자 호출");
	}
	
	//자식 클래스로 객체를 생성하기 위해 기본 생성자가 호출되면
	//super()라는 메서드를 통해 부모클래스의 기본 생성자 호출
	//부모 먼저 생성 후 자식 개체를 감싸고 부모객체 생성됨.
	@Override
	public int result() {
		return super.result();
	}
}
