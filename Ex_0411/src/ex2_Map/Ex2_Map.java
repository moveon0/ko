package ex2_Map;

import java.util.HashMap;

public class Ex2_Map {
	public static void main(String[] args) {
		HashMap<String, Float> map = new HashMap<>();
		map.put("k1", 100.0f);
		map.put("k2", 3.14f);
		map.put("k3", 4.15f);
		
		//value값 조회하기
		System.out.println(map.get("k1"));
		
		//요소 삭제하기
		map.remove("k1");
		
		System.out.println(map);
		
		//map의 크기
		System.out.println("map의 크기 : " + map.size());
		
		//containskey(Object key)
		//map객체 안에 해당 key가 존재하는가
		
		if(map.containsKey("k2")) {
			System.out.println("k2라는 키가 존재합니다.");
		}
		
		//containsvalue(Object value)
		//map 객체 안에 해당 value가 존재하는가
		
		if(map.containsValue((3.14f))){
			System.out.println("3.14라는 value가 있습니다.");
		}
	
	
		//비어있는지 검사
		//비어있으면 true
		if(map.isEmpty()) {
			System.out.println("map이 비었습니다.");
		}
	}
}
