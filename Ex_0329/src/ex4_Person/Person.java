package ex4_Person;
/*
 * -오버로딩
 * 
 * 메서드의 중복정의
 * 하나의 메서드명을 여러 기능을 구현하는 것
 * 
 * -오버로딩의 조건
 * 
 * 1. 메서드의 이름이 같아야 한다.
 * 2. 매개변수의 개수가 달라야 한다.
 * 3. 매개변수의 개수가 같아도 타입이 달라야 한다.
 * 4. 매개변수의 개수가 같아도 순서가 다르면 된다.
 */
public class Person {
	String name;
	int age;
	
	//임의로 새로운 생성자를 정의한 순간부터 기본생성자는 쓸 수 없다.
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	//기본생성자를 사용하고 싶으면 직접 정의해야 한다.
	public Person() {
		
	}
}
