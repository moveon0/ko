package ex5_generic;
//제네릭 메서드

/*
 * 메서드의 선언부에 제네릭 타입이 선언된 메서드
 * 선언 위치는 반환형 앞이고, 작성한 제네릭 타입으로 반환형, 매개변수 타입이 결정된다.ㄴ
 */
public class PeopleMain {
	public static void main(String[] args) {
		People<String, Integer> p1 = new People<String, Integer>("제임스", 30);
		People<String, Integer> p2 = new People<String, Integer>("스티브", 25);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println("------------");
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
	}
}
