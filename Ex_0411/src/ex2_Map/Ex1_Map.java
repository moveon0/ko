package ex2_Map;
import java.util.HashMap;
//Map

/*
 * 데이터를 키(key)와 값(value)가 한 쌍으로 저장되는 방식을 사용하는 자료구조
 * index가 없고 키를 통해 추가, 조회, 삭제, 수정을 한다.
 * key를 통해 값을 검색하므로 많은 양의 데이터를 조회하는 데 매우 뛰어난 성능을 발휘함.
 * 
 * HashMap
 * map 인터페이스를 구현하고 있는 클래스 중 가장 많이 사용하는 클래스
 */
public class Ex1_Map {
	public static void main(String[] args) {
		HashMap<Integer, Character> map = new HashMap<>();
		//데이터의 추가
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		//map에 저장되는 value는 중복될 수 있다.
		map.put(4, 'a');
		
		//map의 key는 중복될 수 없다.
		//이미 키가 있다면 value가 갱신된다.
		map.put(1,'F');
		System.out.println(map);
	}
}
