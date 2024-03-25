package ex2_while;
import java.util.Scanner;
public class Ex2_do_while {
	public static void main(String[] args) {
		//while은 선비교 후처리를 하지만
		//do-while은 선처리 후비교를 해서 조건에 맞지 않아도 한 번은 실행된다.
		//제어문 중 유일하게 세미콜론(;)을 붙혀야 한다.
		
		int i = 11;
		
		do {
			System.out.println(i);
		} while(i<=10);
		
		//반복 횟수가 지정되는 경우 -> 횟수를 만족할 때까지 반복
		//ex) 물통에 물을 10번 채워라 -> for문
		
		//특정 조건이 부여되는 경우 -> 조건이 만족할 때까지 반복 
		//물통에 물이 가득 찰때까지 -> while
		
		//특정 조건과 옵션이 부여되는 경우
		//물통에 물을 따르고 새지 않으면 계속 부어라 - > do-while
		
		//키보드에서 국어,영어,수학 점수를 입력받고
		//100점이 넘으면 다시 입력받고 출력.
		
		Scanner sc = new Scanner(System.in);
		
		/*int kor, eng, mat;
		
		do { 
			System.out.println("국어 : ");
			kor = sc.nextInt();
			
			System.out.println("영어 : ");
			eng = sc.nextInt();

			System.out.println("수학 : ");
			mat = sc.nextInt();
		} while (kor <=100 && eng <=100 && mat <=100);
		
		System.out.println("국어 :"+kor);
		System.out.println("영어 :"+eng);
		System.out.println("수학 :"+mat);
		*/
		
		//1 2 3 4 5 6 7 8 9 10
		//2 3 4 5 6 7 8 9 10 1
		//3 4 5 6 7 8 9 10 1 2
		//4 5 6 7 8 9 10 1 2 3 
		//5 6 7 8 9 10 1 2 3 4 
		//6 7 8 9 10 1 2 3 4 5 
		//7 8 9 10 1 2 3 4 5 6
		//8 9 10 1 2 3 4 5 6 7
		//9 10 1 2 3 4 5 6 7 8 
		//10 1 2 3 4 5 6 7 8 9 
		System.out.println("-------------------------");
		for (int s = 1; s < 11; s++) {
			switch (s) {
			case 1:
				System.out.println("1 2 3 4 5 6 7 8 9 10");
				break;
			case 2:
				System.out.println("2 3 4 5 6 7 8 9 10 1");
				break;
			case 3:
				System.out.println("3 4 5 6 7 8 9 10 1 2");
				break;
			case 4:
				System.out.println("4 5 6 7 8 9 10 1 2 3 ");
				break;
			case 5:
				System.out.println("5 6 7 8 9 10 1 2 3 4");
				break;
			case 6:
				System.out.println("6 7 8 9 10 1 2 3 4 5");
				break;
			case 7:
				System.out.println("7 8 9 10 1 2 3 4 5 6");
				break;
			case 8:
				System.out.println("8 9 10 1 2 3 4 5 6 7");
				break;
			case 9:
				System.out.println("9 10 1 2 3 4 5 6 7 8 ");
				break;
			case 10:
				System.out.println("10 1 2 3 4 5 6 7 8 9 ");
				break;
			}
				
				
		}
		System.out.println("-------------------------");
		
		for (int j = 1; j < 11; j++) {
			int cur = j;
			for (int k = 0; k < 10; k++) {
				if (cur < 11) {
					System.out.print(cur+" ");
					cur+=1;
				} else {
					System.out.print(-(cur-(k+j)-1)+" ");
				}
			}
			System.out.println();
		}
		
		

	}
}
