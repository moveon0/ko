package ex1_List;
import java.util.ArrayList;
import java.util.List;
public class Ex2_ArrayList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();//ArrayList가 List 인터페이스를 implement 한 것
		list.add(10);
		list.add(10);
		list.add(1,14);//데이터를 1번 index에 추가하여 방 번호가 밀림
		list.set(2, 20);
		list.add(50);
		System.out.println(list);
		
		int res = list.remove(1);
		//중간의 요소를 삭제하면 index가 당겨진다.
		System.out.println(res);
		
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
	}
}
