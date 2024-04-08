package ex5_generic;
//Gen클래스에 제네릭 타입 <T>를 갖는 printArr메서드를 만든다.
//printArr메서드 내부에서 배열을 순차적으로 출력하는 코드 작성
//Gen2Main클래스를 만들어서 Integer[], Double[], Character[]를
//각각 만든 뒤 Gen 클래스의 printArr메서드를 호출해 배열의 내용 출력하기ㄴ
//결과
//1 2 3 4 5
//1.1 2.2 3.3 4.4 5.5
//A B C D E

public class Gen {


	public <T> void printArr(T[] arr) {
		for(int i =0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		
	
	}
}
