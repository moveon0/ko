package ex1_lamda;

import java.util.function.Function;

//람다식의 합성과 결합
//f.andThen(g) - 함수 f를 먼저 적용하고 그 다음 함수 g를 적용하겠다
//f.compose(g) - g를 먼저 적용하고 f를 적용하겠다
public class Ex1_function {
	public static void main(String[] args) {//Integer.parseInt(값, 진수)
		Function <String, Integer> f = (t) -> Integer.parseInt(t,16);
											//값을 이진수로 바꿔줌
		Function <Integer, String> g = (t) -> Integer.toBinaryString(t);
		
		Function<String, String> h = f.andThen(g);//16진수로 바꾸고 2진수로 바꿔서 출력
		Function<Integer, Integer> h2 = f.compose(g);
		System.out.println(h.apply("FF"));	//"FF" -> 255 -> "11111111"
		System.out.println(h2.apply(2));
	}
}
