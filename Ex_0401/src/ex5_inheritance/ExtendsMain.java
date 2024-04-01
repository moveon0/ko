package ex5_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		Child c1 = new Child();
		//자식은 부모의 재산을 사용할 수 있다.
		System.out.println(c1.car);
		System.out.println(c1.money);
		System.out.println(c1.home);
		
		Parent p1= new Parent();
		//부모클래스는 자식의 재산을 사용할 수 없다.
		System.out.println(p1.money);
		System.out.println(p1.home);
		//System.out.println(p1.car);
		
		//상속의 특징
		/*한 개의 자식클래스가 두 개의 부모클래스를 상속받는 것은 불가능하다.
		 * 명시되지는 않았지만 모든 클래스는 Object클래스를 상속받고 있다.
		 * Object는 모든 타입을 받아들일 수 있는 최상위 객체이다.
		 */
	}
}
