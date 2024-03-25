package ex_1for;

public class Ex2_multi_for {
	public static void main(String[] args) {
		//다중 for문
		//for문 안에 for문이 있는 경우
		//for문 자체를 반복
		
		//for(초기식; 조건식; 증감식) {
		//	for(초기식; 조건식; 증감식) {
		//		반복하고자 하는 명령
		//		}
		//	}
		
		for(int i = 1; i<=3; i++) {
			for(int j = 1; j <= 3; j++) {
				System.out.println(i+" "+j);
			}
		}
		
		// 1 1 1 
		// 1 1 1 
		// 1 1 1 
		// 1 1 1 
		
		
		for (int i = 0; i < 4; i++) {
			for(int j = 1; j <=3; j++) {
				System.out.print('1'+" ");
			}
			System.out.println();
		}
		
		// 1 2 3 4
		// 5 6 7 8
		// 9 10 11 12
		int num = 1;
		for (int i = 0; i < 3; i++) {
			for ( int j = 0; j < 4; j++) {
				System.out.printf("%02d ",num);
				num++;
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < 3; i++) {
			int a=65;
			for (int j = 0; j < 4; j++) {
				System.out.printf("%c ",a);
				a++;
				
			}
			System.out.println();
		}
		System.out.println();
		int a=65;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%c ",a);
				a++;
				
			}
			System.out.println();
		}
		
		//*
		//* *
		//* * * 
		//* * * *
		//* * * * *
		
		for (int i = 1; i<=5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
