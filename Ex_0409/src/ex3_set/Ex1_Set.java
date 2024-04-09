package ex3_set;
import java.util.Set;
import java.util.HashSet;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Ex1_Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		//set에 데이터 추가
		set.add("f");
		set.add("a");
		set.add("c");
		set.add("b");
		set.add("d");
		
		System.out.println(set);
		
		//set에는 중복되는 데이터를 추가할 수 없다.
		set.add("a");
		set.add("b");
		System.out.println(set);
		
		//set에 저장되어있는 a라는 데이터를 제거
		set.remove("a");
		System.out.println(set);
		
		//모든 요소 제거하기
		set.clear();
		set.removeAll(set);
		
		//중복이 없기 때문에 난수를 생성해 넣기가 편하다.
		Set<Integer> set2 = new HashSet<>();
		
		//로또번호 6개 넣기
		Random random = new Random();
		for( int i = 0; set2.size()<6;i++) {
			set2.add(random.nextInt(46)+1);
		}
		System.out.println(set2);
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,3));
		
		System.out.println(list);
		
		Set<Integer> set3 = new HashSet<>(list);
		
		System.out.println(set3);
	}
}
