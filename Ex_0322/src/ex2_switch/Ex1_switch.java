package ex2_switch;

public class Ex1_switch {
	public static void main(String[] args) {
		//if문과 비슷하지만 switch문은 인자값으로 '조건'이 아닌 '값'이 들어간다.
		
		//기본형
		//switch(비교값) {
		//case 조건값:
		// 비교값과 조건값이 일치할 때 명령;
		// break;
		//case 조건값:
		// 비교값과 조건값이 일치할 때 명령;
		//	break;
		//default:
		//	비교값과 조건값이 하나도 일치하지 않을 때 실행할 명령;
		//	break;
		
		//조건값 중복 불가
		//조건값과 비교값의 타입은 반드시 일치해야 함.
		int n = 1;
		
		switch(n) {
		case 1:
			System.out.println("게임하기");
			break;
		case 2:
			System.out.println("게임설정");
			break;
		case 3:
			System.out.println("게임종료");
			break;
		}
		
		//if 문은 범위에 따라 조건을 비교하는 데 효과적이고
		//switch 문은 하나의 값에 따라 조건을 비교하는데 효과적이다.
	}
}
