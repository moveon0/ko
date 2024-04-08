package ex1_StringBuilder;
//StringBuilder / StringBufferㄴ

/*
 * String클래스는 최초 지정된 문자열 이후에 값이 추가되면 내부적으로 새로운 메모리를 할당해 새롭게 문자열을 등록한다.
 * 
 * 문자열을 많이 사용할수록 메모리 사용이 늘어나 메모리가 낭비될 수 있다.
 * 
 * StringBuffer와 StringBuilder는 내부에 여유공간을 두기 때문에 
 * 문자열을 합칠 때 메모리에 새롭게 생성하는 과정을 String보다 현저히 생략할 수 있다.
 * 
 *  StringBuffer와 StringBuilder는 사용하는 기능측면에서는 차이가 없으나
 *  StringBuffer의 경우 스레드 환경에서 안정성을 추가로 가지고 있따.
 *  
 *  스레드 환경이 아닌 경우 SringBuilder의 성능이 좋으므로 
 *  일반적인 프로그래밍에서는 StringBuilder를 사용하는 것을 권장한다.
 *  
 *  -StringBuilder의 메서드
 *  
 *  append(String str) : 기존 문자열 뒤에 더하여 반환
 *  delete(int start, int end) : 시작위치부터 끝 위치 전까지 삭제
 *  insert(int offset, String str) : 시작 위치부터 문자열을ㅇ 삽입
 *  reverse(): 문자열을 거꾸로 출력
 */
public class Ex1_StringBuilder {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello");
		
		//기존 문자열 뒤에 삽입
		str.append(" World");
		System.out.println(str);
		System.out.println("문자열의 길이 : " +str.length());
		
		//문자열 삭제
		str.delete(0, 6);
		System.out.println(str);
		
		//원하는 위치에 문자열 삽입
		str.insert(0, "Hello ");
		System.out.println(str);
		System.out.println("문자열의 길이 : " + str.length());
		
		//문자를 거꾸로 출력
		str.reverse();
		System.out.println(str);
	}
}
