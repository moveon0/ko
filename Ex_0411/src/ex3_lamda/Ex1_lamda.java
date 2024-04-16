package ex3_lamda;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex1_lamda {
	public static void main(String[] args) {
		//컬렉션 프레임워크와 함수형 인터페이스
		//컬렉션 프레임워크의 인터페이스에 다수의 디폴트 메서드가 있고
		//그 중 일부는 함수형 인터페이스를 사용
		ArrayList<String> list = new ArrayList<>(Arrays.asList("이름1","이름2","이름3","이름4","이름5"));
		
		//void accept(T t);
		list.forEach((String t) -> {System.out.println(t);});
		list.forEach(System.out::println);
		
	}
}
