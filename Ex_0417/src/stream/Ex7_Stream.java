package stream;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex7_Stream {
	public static void main(String[] args) {
		//임의의 수
		//Random 클래스에는 난수들로 이루어진 스트림을 반환하는 메서드를 가지고 있다.
		
		//IntStream ints(long streamSize)
		//LongStream longs (long streamSize)
		//DoubleStream doubles(long streamSize)
		
		Random rnd = new Random();
		IntStream stream = rnd.ints(1, 46);
		stream.limit(6).forEach(x -> System.out.printf(x + " "));
	}
}
