package ex2_Map;

import java.util.HashMap;
import java.util.Scanner;

//로그인
//id : aaa
//pw : 111
//아이디가 존재하지 않습니다.
//id : lee
//pw : 3333
//비밀번호 불일치
//id : park
//pw : 3333
//로그인 성공
public class Ex3_Map {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);
		
		Scanner sc = new Scanner(System.in);
		
		/*outer :while(true) {
			System.out.println("로그인 ");
			System.out.print("id :");
			String id = sc.next();
			System.out.print("pw : ");
			int pw = sc.nextInt();
			if(map.containsKey(id)) {
				if(map.containsValue(pw)) {
					System.out.println("로그인 성공");
					break;
				}	else {
					System.out.println("비밀번호 불일치");
					continue outer;
				}
			} else {
				System.out.println("아이디 불일치");
				continue outer;
			}
		}
		*/
		//강사님 풀이
		System.out.println("로그인 ");
		System.out.print("id :");
		String id = sc.next();
		System.out.print("pw : ");
		int pw = sc.nextInt();
		if(!map.containsKey(id)) {
			System.out.println("아이디 존재x");
		} else {
			//map 객체에 key가 존재함
			if(map.get(id) != pw) {
				System.out.println("비밀번호 불일치");
			} else {
				System.out.println("로그인 성공!");
			}
		}
	}
}
