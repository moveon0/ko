package ex1_lamda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

//메서드 참조ㄴ
//메서드를 참조해 매개변수의 정보 및 반환형을 알아내어
//람다식에서 불필요한 매개변수를 제거하는 것
//람다식이 하나의 메서드만 호출하는 경우 사용할 수 있다.
//하나의 메서드만 호출하는 람다식은
//클래스명::메서드명
//변수명::메서드명
public class Ex2_function {
	public static void main(String[] args) {
		//Function<String, Integer> f = (String s ) -> Integer.parseInt(s);
		Function<String, Integer> f = Integer::parseInt;
		//두 문자열의 값이 같은지 비교
		//BiFunction<String, String, Boolean> g = (s1, s2) -> s1.equals(s2);
		BiFunction<String, String, Boolean> g = String::equals;
		
		IntBinaryOperator operator = Math::max;
		operator.applyAsInt(100, 200);
		
	}
}
