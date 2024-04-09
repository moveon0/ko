package ex4_iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Ex1_Iterator {
	public static void main(String[] args) {
		//반복자(Iterator)
		//사전적인 의미로는 '반복하다'라는 뜻을 지니고 있다.
		//컬렉션의 요소를 순회하여 하나씩 추출하는데 사용한다.
		//Iterator객체는 선언된 컬렉션 객체에서 가져와 사용한다.
		
		//boolean hasNext()		다음에 순회할 데이터 유무 확인 (있으면 true, 없으면 false)
		//E next();				다음 위치의 데이터로 이동하여 값을 반환
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Iterator<Integer> iter = list.iterator();
		
		while(iter.hasNext()) {
			int val = iter.next();
			System.out.print(val+" ");
			
		
		}
	}
}
