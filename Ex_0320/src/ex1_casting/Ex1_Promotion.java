package ex1_casting;

public class Ex1_Promotion {
	public static void main(String[] args) {
		//형변환(casting)
		//모든 연산은 같은 자료형끼리만 수행가능
		//다른 자료형끼리의 연산은 같은 자료형으로 변환 후 가능.
		
		//Promotion(자동형변환)
		//작은 자료형에서 큰 자료형으로 변환할 때
		//byte -> short -> int -> long
		//정수형이 실수형으로 변환될 때
		
		double d = 100.5;
		int n = 200;
		d = n;
		System.out.println("d = "+d);
		
		char c = 'A';
		long l = 100;
		l = c;
		
		System.out.println("l = "+l);
	}

}
