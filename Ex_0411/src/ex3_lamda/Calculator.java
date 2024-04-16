package ex3_lamda;
//람다식(lamda - expression

/*
 * jdk 1.8부터 함수형 프로그래밍 '람다식' 지원
 * 람다식은 이름이 없는 익명 함수를 만들기 위한 표현식을 말한다.
 * 자바는 객체를 기반으로 프로그램을 구성하는 객체 지향 프로그래밍
 * 따라서 클래스를 먼저 생성하고, 클래스 안에 메서드를 정의하고 객체를 만들어 사용해야 함
 * 
 * 함수형 프로그래밍은 객체 지향 프로그래밍과 달리 함수만 구현하고 실행할 수 있는 개발방식이다.
 * 
 * -람다식이 도입된 이유
 * 
 * 함수형 프로그래밍 방식을 도입하기 위해
 * 완벽한 함수형 프로그래밍의 구현은 불가
 * 
 * -람다식 문법
 * 
 * 람다식 문법은 기존의 자바 문법과는 달라 객체 지향 프로그래밍에 익숙한
 * 개발자들은 다소 생소할 수 있다.
 * 하지만 문법이 매우 간결해지고 원하는 결과를 쉽게 집계할 수 있어 익숙해지면 큰 장점이 있다.
 * 
 * public int add(int x, int y){
 * 	return x + y;
 * }
 * 메서드의 이름과 반환형을 제거하고 화살표를 이용해 구현
 * (int x, int y)->{return x + y};
 * 
 * 소괄호 생략하기
 * 
 * 람다식 문법에선 매개변수의 자료형을 생략할 수 있다.
 * 매개변수가 한 개인 경우엔 소괄호도 생략할 수 있다.
 * 매개변수가 두 개 이상인 경우에는 생략할 수 없다.
 * (int z) -> {System.out.println(z);}
 * z -> {System.out.println(z);}
 * 
 * (int x, int y) -> {System.out.println(x+y);}
 * 
 * 중괄호 생략하기
 * return 이 없는 경우
 * (int x, int y) -> {System.out.println(x+y);}
 * x, y -> System.out.println(x+y);
 * 
 * 있는 경우
 * (x,y) -> {return x+y;}
 * (x,y) -> x+y;
 * 
 * -함수형 인터페이스
 * 객체 지향 프로그램에서 인터페이스를 사용하려면 인터페이스를 클래스에서 구현한 뒤 사용해야 한다.
 * 람다식은 위의 과정을 생략할 수 있다.
 * 단, 람다식을 이용해 인터페이스를 사용할 경우 인터페이스는 하나의 기능만 정의할 수 있다.
 * 람다식을 구현하기 위해서는 먼저 인터페이스를 만들고, 
 * 인터페이스에 람다식으로 구현할 추상 메서드를 선언한다.
 * 오직 하나의 추상 메서드가 선언된 인터페이스만이 람다식의 타겟 타입이 될 수 있는데
 * 이러한 인터페이스를 '함수형 인터페이스'라고 한다.
 * 
 * java.util.function 패키지
 * 
 * 대부분의 메서드는 타입이 비슷하다
 * 매개변수의 개수는 없거나 한개 두개 정도이다.
 * 제네릭으로 정의하면 타입이 달라도 문제가 되지 않는다.
 * java.util.function패키지에 일반적으로 자주 사용되는 형식의 메서드들을 함수형 인터페이스로 미리 정의해놨다.
 * 매번 함수형 인터페이스를 정의하기보단 가능한 이 패키지의 인터페이스를 활용하는 것이 좋다.
 * 
 * Supplier 		T get()
 * 
 * Consumer			void accept(T t)
 * 
 * Function<T,R>	R apply(T t)
 * 
 * Predicate		boolean test(T t)
 * 
 * 매개변수가 두 개인 함수형 인터페이스
 * BiConsumer<T,U>		void accept(T t, U u)
 * BiPredicate<T,U>		boolean test(T t, U u)
 * BiFunction<T,U,R>	R apply(T t, U u)
 * 
 */

public class Calculator {
	public static void main(String[] args) {
		MyCalculator calc = (int num1, int num2)-> {return num1 + num2;};
		
		int result = calc.plus(20,	30);
		System.out.println(result);
	}
}
