package ex1_operator;

public class Ex5_Operator {
	public static void main(String[] args) {
		//삼항연산자
		//하나의 조건을 정의해 참일 때
		//반환할 값, 거짓일 때 반환할 값을
		//가지는 연산자
		
		//조건식
		//참과 거짓으로 판별 가능한 식
		//비교연산자, 논리연산자
		
		int x = 10;
		int y = 15;
		
		boolean result = ++x >= y ? true : false;
		
		System.out.println(result);
		
		int n1 = 10;
		int n2 = 20;
		
		char result2 = (n1 += n1) == n2 ? 'O' : 'X';
		System.out.println(result2);
		
		System.out.println("------------------");
		
		int a = 10;
		int b = 15;
		
		result = ++a >= b || 2 + 7 <= b && 13 - b >= 0 && (a+=b) - (b % a) >10;
		//0
		System.out.println(result);
		
		System.out.println("------------------");
		
		/*
		 * 과수원에서 하루에 생산되는 배, 사과 오렌지의 양은 
		 * 각각 5, 7, 5개입니다.
		 * 과수원에서 하루에 생산되는 총 개수를 출력하고,
		 * 시간당 과일의 평균 생산 개수를 출력
		 */
		
		int pear=5;
		int apple = 7;
		int orange = 5;
		
		float avr_p = (float)pear/24;
		float avr_a = (float)apple/24;
		float avr_o = (float)orange/24;
		
		System.out.println("하루 총 생산량: "+(pear+apple+orange));
		System.out.println("시간당 배 생산량: "+(avr_p));
		System.out.println("시간당 사과 생산량: "+(avr_a));
		System.out.println("시간당 오렌지 생산량: "+(avr_o));
		
		System.out.println("--------------------");
		
		/*
		 * 농구공을 담기 위해 필요한 상자의 개수를 구하시오
		 * 상자 하나엔 농구공 5개가 들어간다.
		 * 농구공이 23개라면 몇 개의 상자가 필요할까?
		 */
		
		int ball = 23;
		int box = ball % 5 == 0 ? ball/5 : ball/5 + 1;
		
		
		//int box = ball/5 + 5/(ball%5)  ;
		System.out.println("필요한 상자의 개수: "+box);
		
	}
}
