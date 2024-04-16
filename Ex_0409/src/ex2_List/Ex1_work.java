package ex2_List;
//ArrayList문제
//아래의 결과를 도출
//아이디 생성 : abc
//아이디 출력 
//아이디 생성 : abc2
//abc abc2
//아이디 생성 : abc3
//abc abc2 abc3
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ex1_work {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> arr = new ArrayList<>();
		/*System.out.println("아이디를 입력하세요 : ");
		arr.add(sc.next());
		String a=arr.get(0);
		System.out.println(arr.get(0));
		System.out.println("아이디를 입력하세요 : ");
		arr.add(sc.next());
		String b=arr.get(1);
		System.out.printf("%s, %s\n",a,b);
		System.out.println("아이디를 입력하세요 : ");
		arr.add(sc.next());
		String c = arr.get(2);
		System.out.printf("%s, %s, %s\n",a,b,c);
		*/
		//강사님 풀이
		
		while(true) {
			System.out.printf("아이디 생성 : ");
			String a = sc.next();
			if (arr.contains(a)) {
				System.out.println("중복된 아이디");
			} else {
				arr.add(a);
			}
			for (String s : arr) {
				System.out.print(s+" ");
			}
			System.out.println();
			if(arr.size()==3) {
				break;
			}
		}
		
		//강사님 풀이
		/*while(true) {
			System.out.println("아이디 생성 :");
			String id = sc.next();
			
			for(int i = 0; i < arr.size(); i++) {
				if(id.equals(arr.get(i))) {
					System.out.println("중복된 아이디");
					continue ;
				}
			}
		}*/
	}
}
