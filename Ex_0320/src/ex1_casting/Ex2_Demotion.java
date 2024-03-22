package ex1_casting;

public class Ex2_Demotion {
	public static void main(String[] args) {
		//Demotion(강제형변환)
		//큰 컵의 물을 작은 컵으로 옮겨 담는 것과 같다.
		//물의 양에 따라 보존될 수도 넘칠 수도 있다.
		//큰 자료형에서 작은 자료형으로 변환 시 데이터의 손실이 발생할 수도 있다.
		
		//형변환 방법
		//(자료형)데이터 or 변수;
		
		char c = 'B';
		int i = 67;
		c = (char)i; //char 2byte, int 4byte
		
		System.out.println("c="+c);
		
		float f = 5.5f;
		int n = 0;
		
		n = (int)f;//float 4byte, int 4byte
		//같은 4byte여도 자료형이 불일치할 시 대입 불가능
		
		//float에서 int로 casting되면서 
		//소수점 이하 자리 상실
		System.out.println("n="+n);
		
		//자바의 특징
		byte b1 = 100;
		byte b2 = 20;
		
		byte b3 = (byte)(b1 + b2);
		int b4 = b1 + b2;
		//byte의 표현범위가 127까지밖에 안되어
		//byte끼리의 연산은 127을 넘을 가능성이 높다.
		//이런 상황을 대비해 java개발자들은
		//byte끼리의 연산이 수행될 때 int형 변수로
		//값을 받도록 만듦
	}
}
