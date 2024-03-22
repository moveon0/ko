
package ex1_operator;

public class Ex1_operator {
	public static void main(String[] args) {
		//연산자(Operator)
		//연산작업은 항(피연산자)과 연산자로 이루어짐.
		//항은 연산에 사용되는 값, 연산자는 기호를 의미
		//항과 연산자를 이용해 연산자를 나열한 것을
		//연산식(expression)이라 함.
		
		//기본연산자의 종류
		//피연산자의 개수에 따라 단항,이항,삼항 연산자로 분류
		//사용 목적에 따라 산술,증감,대입,비교,논리,비트 등으로 분류
		
		//최고연산자 : . ()
		//증감연산자 : ++,--
		//산술연산자 : +,-,*,/,%
		//시프트연산자 : >>, <<
		//비교연산자 : >, <, >=, <=, ==, !=
		//논리연산자 : &&, ||, !
		//비트연산자 : &, |, ~, ^
		//대입연산자 : =, +=, -=, /=, *=, %=
		//삼항연산자 : ?:
		
		//산술연산자
		//사칙연산 (+,-,/,%)과 나머지 값을 구하는 (%)로 나뉨.
		
		int n1, n2, n3;
		n1 = 20;
		n2 = 7;
		n3 = n1 + n2;
		System.out.println("n3="+n3);
		
		n3 = n1 - n2;
		System.out.println("n3=" + n3);
		
		n3 = n1 / n2;
		System.out.println("n3="+n3);
		
		n3 = n1 % n2;
		System.out.println("n3="+n3);
		
		//산술변환
		// 이항 연산자는 두 피연산자의 타입이 일치해야함.
		// 컴퓨터는 서로 다른 타입을 계산하지 못하므로 값의 손실이 적은 쪽으로 타입을 맞춘다.
		// long + int -> long + long -> long
		// float + int -> float +float -> float
		// double + float -> double + double -> double
	}

}
