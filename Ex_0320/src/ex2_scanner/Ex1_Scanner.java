package ex2_scanner;

import java.util.Scanner;

public class Ex1_Scanner {
	public static void main(String[] args) {
		//데이터의 입력
		//키보드를 통해 데이터 입력하는 방법
		//'java.util' 패키지에 있는 Scanner 클래스를 사용
		
		
		Scanner sc = new Scanner(System.in);
	
		

		
		//객체에서 기능은 함수형태로 저장됨
		//기능을 호출하기 위해선 함수를 호출하면 됨
		
		//정수
		//nextByte() 입력값을 Byte형으로
		//nextShort()
		//nextInt()
		
		//실수형
		//nextFloat()
		//nextDouble()
		
		//문자열
		//nextLine() 입력받은 줄 전체를 문자열로 반환 enter누르면 끝
		//next() 입력받은 값을 문자열 타입으로 저장 spacebar 누르면 끝
		
		//System.out.print("나이를 입력해주세요 : ");
		//int age = sc.nextInt();
		//System.out.println("나이 : " + age);
		
		//이름,나이,주소,키를 입력받고
		//name,age,address,height에 저장 후
		//다음과 같이 출력하시오.
		
		//당신의 이름은 홍길동입니다.
		//당신의 나이는 20살입니다.
		//당신의 주소는 인천시 부평구입니다.
		//당신의 키는 195.4cm입니다.
		
		String name = sc.nextLine();
		int age = sc.nextInt();//입력 후 enter누르면 enter 전까지 저장됨
		sc.nextLine();//남아있는 줄바꿈 키가 여기서 가져감
		String address = sc.nextLine();
		double height = sc.nextDouble();
		
		System.out.printf("당신의 이름은 %s입니다.\n",name);
		System.out.printf("당신의 나이는 %d살입니다.\n",age);
		System.out.printf("당신의 주소는 %s입니다.\n",address);
		System.out.printf("당신의 키는 %.1f입니다.\n",height);
	}

}
