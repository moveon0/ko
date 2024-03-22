package ex2_switch;

public class Ex2_switch {
	public static void main(String[] args) {
		//switch문의 비교값으로 사용할 수 있는 자료형
		//1) 정수(byte, short, int)
		//2) 문자형(char)
		//3) 문자열(String)
		
		char c = '홍';
		String result = null;
		
		switch(c) {
		case '박':
			result = "박길동";
			break;
		case '이':
			result = "이길동";
			break;
		case '김':
			result = "김길동";
			break;
		case '홍':
			result = "홍길동";
			break;
		}
		
		System.out.println(result);
		
		System.out.println("------------");
		
		//switch 문에 break가 없다면
		//조건에 맞는 case를 시작으로 모든 case구문이 실행됨
		//따라서 개발자는 break; 키워드를 적절하게 이용할 수 있어야 함.
		int num = 1;
		switch(num) {
		case 1:
			System.out.println("num은 1입니다.");
		case 7:
			System.out.println("num은 7입니다.");
		default:
			System.out.println("num은 1도 7도 아닙니다.");
		}
		
		//1~9까지 짝수면 짝수입니다, 홀수면 홀수입니다.
		int i = 2;
		
		switch(i) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println(i + "는 홀수입니다.");
			break;
		case 2:
		case 4:
		case 6:
		case 8:
			System.out.println(i+"는 짝수입니다.");
		}
	}
}
