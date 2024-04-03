package ex3_bread;

public class Bread {
	public void makebread() {
		System.out.println("빵을 만들었습니다.");
	}
	//s
	public void makebread(int n) {
		for( int i = 0; i < n; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다.\n",n);
	}
	
	public void makebread(int n, String c) {
		for(int i = 0; i < n; i++) {
			System.out.printf("%s빵을 만들었습니다.\n",c);
		}
		System.out.printf("요청하신 %d개의 %s빵을 만들었습니다.",n,c);
		System.out.println("---------------");
	}
	//강사님 풀이
	
}
