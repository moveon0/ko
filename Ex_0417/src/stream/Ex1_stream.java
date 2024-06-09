package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Stream

/*
 *JAVA 8 에서 추가된 기능인 Stream은 java의 컬렉션 데이터에 대해
 *sql질의문처럼 데이터를 처리할 수 있는 기능을 가지고 있습니다.
 *
 * 기존 루프문 처리의 문제점
 * 기존 java에서 컬렉션 데이터를 처리할 때
 * for, forEach를 사용하면서  컬렉션 내의 요소들을 하나씩 다뤘다.
 * 간단한 처리나 컬렉션의 크기가 작으면 큰 문제가 아니지만
 * 복잡한 처리가 필요하거나
 * 컬렉션의 크기가 커지면 루프문의 사용은 성능저하를 일으킬 수 있다.
 * 
 * 스트림의 추가로 컬렉션 데이터를 선언형으로 쉽게 처리할 수 있다.
 * 복잡한 루프문을 사용하지 않아도 되며 루프문을 중첩해서 사용해야 되는
 *	최악의 경우도 더 이상 없어졌다.
 *
 *스트림은 '데이터의 흐름'이다. 배열 또는 컬렉션 객체에 여러 개의 메서드를 조합해
 *원하는 결과를 필터링하고 가공된 결과를 얻을 수 있다.
 *또한 람다식을 이용해 코드의 양을 줄이고 간결하게 표현할 수 있다.
 *즉 배열과 컬렉션어을 함수형프로그래밍으로 처리할 수 있다.
 *
 *-스트림의 특징
 *
 *스트림은 데이터 소스로부터 데이터를 읽기만 할 뿐,
 *데이터 소스를 변경하지 않는다.
 *스트림은 한 번 사용하면 닫히기 때문에 다시 사용할 수 없다.
 * 
 * -스트림 사용과정
 * 
 * 1.생성 : 스트림 객체 생성
 * 2. 가공하기 : 필터링(filtering), 매핑(mapping) 등 원하는 결과를 만들어가는 중간작업
 * 3. 결과만들기 : 최종적으로 결과를 만드는 작업
 * 
 * -만들기
 * -배열
 * Arrays클래스 -> static stream()
 * Stream.of(T[] t)
 * Stream.of(T...values)
 * 
 * -컬렉션
 * Collection 인터페이스 - stream()
 * 
 * -기본 자료형
 * IntStream, LongStream, DoubleStream
 * 
 * -스트림의 연산
 * 
 * -중간연산
 * 연산의 결과를 Stream타입으로 반환하는 연산, Stream에 연속해서 중간 연산할 수 있다.
 * 
 * -최종연산
 * 
 * 연산의 결과가 Stream이 아닌 연산, 스트림의 요소를 소모하므로 마지막에 한 번만 가능
 * stream.distinct().limit(5).sorted().forEach(System.out::println);
 * 
 * distinct(),limit(),sorted() -> 중간연산
 * forEach() -> 최종연산
 * 
 * -중간연산 메서드
 * 
 * Stream<T> distinct() 						중복을 제거
 * Stream<T> filter(Predicate<T> predicate)		조건에 안 맞는 요소 제외 (람다식 사용가능)
 * Stream<T> limit(long maxSize) 				스트림의 일부를 잘라낸다.
 * Stream<T> skip(long n) 						스트림의 일부를 건너뛴다.
 * Stream<T> peek(Consumer<T> action) 			스트림의 요소에 작업 수행
 * Stream<T> sorted()							스트림의 요소를 정렬
 * Stream<T> sorted(Comparator<T> comparator) 	스트림의 요소 정렬
 * 
 * 스트림의 최종 연산 목록
 * 
 * void forEach(Consumer<? super T> action)
 * long count()		스트림 요소의 개수 반환
 * Optional<T> max(Comparator <? super T> comparator) 	스트림의 최대값 반환 //<? super T> : 최소 T거나 T의 상위
 * Optional<T> min(Comparator <? super T> comparator)	스트림의 최소값 반환
 * 
 * Optional<T> findAny() 스트림에서 아무거나 하나 반환
 * Optional<T> findFirst() 첫 번째 요소 반환
 * 
 * Object[] toArray()
 * A[] toArray(IntFunction<A[]> generator)
 * 스트림의 모든 요소를 배열로 반환
 * 
 * Optional<T> reduce(BinaryOperator<T> accumulator)
 * T reduce(T identity, BinaryOperator<T> accumulator)
 * 스트림에 들어있는 요소를 하나씩 줄여가며 연산
 * 
 * -기본타입형 스트림
 * 제네릭을 사용하지 않고 직접 해당 타입의 스트림을 다룰 수도 있다.
 * IntStream, DoubleStream... 등등
 * 
 */

public class Ex1_stream {
	public static void main(String[] args) {
		String[] strArray = {"홍길동","제임스","스미스"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(x -> System.out.print(x+","));
		System.out.println();
		
		int[] intArray = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		
		intStream.forEach(x -> System.out.print(x+","));
		System.out.println();
		
		
	}
}
