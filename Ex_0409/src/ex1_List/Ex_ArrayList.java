package ex1_List;
import java.util.ArrayList;
//List 컬렉션

/*
 * List는 배열과 유사한 자료구조로 중복이 허용되면서 저장 순서가 유지되는 구조를 제공
 * 따라서 배열처럼 index를 사용해 데이터를 저장하고 찾을 수 있다.
 * 배열과는 다르게 크기의 제한이 없으며 삽입, 삭제, 변경의 기능이 자유롭다.
 * 데이터의 크기를 특정할 수 없는 다량의 데이터를 저장할 때 용이하게 사용 가능
 * 
 * List가 제공하는 주요 메서드
 * 
 * void add(E e) E는 제네릭 타입
 * 메서드							동작					기능
 * void add(E e)				삽입			데이터를 순차적으로 삽입
 * void add(int index, E e) 중간 삽입 		원하는 index위치에 삽입
 * void set(int index, E e) 	치환			index위치의 값을 변경
 * E get(int index)				반환			index위치에 해당하는 값 반환
 * E remove(int index)		삭제			index위치에 해당하는 값 삭제
 * void clear()					전체 삭제		모든 데이터 삭제
 * int size()					크기			저장된 데이터의 개수 반환
 * boolean contains(Object o)   검색			데이터 존재 여부 확인
 * 
 * ArrayList
 * 가장 많이 사용하는 List 인터페이스의 구현 클래스
 * 내부적으로 배열을 이용해 구현되어 배열과의 호환성이 좋은 자료구조
 */
public class Ex_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		
		list.add(100);
		list.add(100);
		list.add(20);
		System.out.println("list의 크기 : "+list.size());
		System.out.println(list);
				//2번 index의 값을 반환);
		int res = list.get(2);
		System.out.println(res);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
		//향상된 for문
		for(int i : list) {
			System.out.println(i+" ");
		}
	
	}
}
