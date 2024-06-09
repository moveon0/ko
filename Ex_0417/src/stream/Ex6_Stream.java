package stream;

import java.util.stream.IntStream;

public class Ex6_Stream {
	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i <= 10; i++) {
			total += i;
		}
		
		System.out.println("1~10까지의 총합 : "+ total);
		
		int total2 = IntStream.rangeClosed(1, 10).sum();//10도 포함
		System.out.println("1~10까지의 총합 : "+ total2);
	}
}
