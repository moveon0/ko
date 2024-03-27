package ex1_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Ex1_Arrays {
	public static void main(String[] args) {
		// Array클래스 : 배열의 도우미 기능을 지닌 메서드를 제공하는 클래스
		// Arrays에 들어있는 기능들을 사용하기 위해 
		// Arrays.함수명()으로 작성해 기능을 호출함.
		
		//배열의 출력 
		//toString()
		//반복문의 도움없이 배열을 출력할 수 있게 해준다.
		//배열에 정의된 값을 문자열(String)형태로 변환해 출력함.
		
		int [] arr = {1,6,3,2,10,4,7,5,9,8};
		
		System.out.println(Arrays.toString(arr));
		
		//배열의 정렬
		//sort()
		//기본적으로 오름차순 정렬
		
		System.out.println("정렬 전");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//내림차순 정렬
		//Comparator.reverseOrder()를 통해 내림차순 정렬 가능
		//그러나 기본자료형 배열로는 불가
		//기본자료형의 클래스타입이 필요한데 이를 Wrapper클래스라고 한다.
		
		
		Integer [] arr2 = {1,6,3,2,10,4,7,5,9,8};
		
		//정렬 후
		Arrays.sort(arr2, Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr2));
		
		
		//배열의 복사
		//자바에서 배열은 한 번 생성하면 길이 변경 불가능
		//따라서 더 많은 데이터 저장이나 똑같은 배열을 새로 만드려면 배열을 복사해야함
		
		//복사방법
		//얕은 복사(Shallow Copy)
		//복사된 배열이나 원본 배열이 변경될 때 서로 간의 값이 함께 변경됨
		//깊은 복사(Deep Copy)
		//복사된 배열이나 원본 배열이 변경될 때 서로 간의 값이 함께 변경되지 않음.
		
		int []arr01 = {1,2,3};
		
		//배열의 얕은 복사
		int[] arr02 = arr01;
		
		arr02[1] = 10;
		
		System.out.println(Arrays.toString(arr01));
		System.out.println(Arrays.toString(arr02));
		
		//깊은 복사
		//배열의 깊은 복사는 반복문을 사용해 새로운 배열에
		//값을 직접 넣거나 
		//Arrays클래스 또는 System클래스가 가진 기능을 이용한다.
		
		int [] cards = {1,6,4,5,3,2};
		int [] newcards = new int [cards.length];
		
		//반복문을 이용한 깊은 복사
		for(int i = 0; i < cards.length; i++) {
			newcards[i] = cards[i];
		}
		
		//Arrays클래스를 이용한 깊은복사
		int[] newcards2 = Arrays.copyOf(cards, cards.length);
		
		newcards[1] = 100;
		System.out.println("cards배열 : " + Arrays.toString(cards));
		System.out.println("newcards배열 : "+Arrays.toString(newcards));
		System.out.println("newcards2배열 : "+Arrays.toString(newcards2));
	}
}