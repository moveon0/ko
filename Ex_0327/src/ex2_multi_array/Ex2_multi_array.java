package ex2_multi_array;
import java.util.Scanner;
public class Ex2_multi_array {
	public static void main(String[] args) {
		int[][] arr= {{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}};
		//1. 총합
		int total = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
			
		}
		System.out.println("총합 : "+total);
		//2. 평균
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
				count+=1;
			}
		}
		
		double avg = total/count;
		System.out.printf("평균 : %.2f" , avg);
		
		System.out.println();
		System.out.println("-------------");
		
		//학생들의 수학과 영어성적을 등록하는 프로그램이 있다.
		//프로그램을 실행하면 몇 명의 정보를 저장할 것인지 입력받은 후
		//입력받은 수만큼 학생들의 이름과 수학, 영어 성적을 입력받는
		//프로그램 작성
		
		//예시
		//등록할 인원수 : 2
		//이름 : 홍길동
		//수학 : 90
		//영어 : 87
		//--------
		//이름 : 제임스
		//수학 : 70
		//영어 : 100
		
		Scanner sc = new Scanner(System.in);
		System.out.println("등록할 인원 수를 입력하세요 : ");
		int n = sc.nextInt();
		
		String [][] arr1 = new String [n][3];
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				switch(j) {
				case 0:
					System.out.print("이름 : ");
					String name = sc.nextLine();
					arr1[i][j] = name;
					System.out.println();
				
				case 1:
					System.out.print("수학 : ");
					String mat = sc.nextLine();
					arr1[i][j] = mat;
					System.out.println();
					
				
				case 2:
					System.out.print("영어 : ");
					String eng = sc.nextLine();
					arr1[i][j] = eng;
					System.out.println();
				}
			}
			System.out.println("--------");
		}
		
		//강사님 풀이
		
		System.out.print("등록할 인원 수 : ");
		int n1 = sc.nextInt();
		
		String [][] str = new String [n1][3];
		
		for ( int i = 0; i < str.length; i++) {
			
				System.out.print("이름 : ");
				str[i][0] = sc.next();
				
				System.out.print("수학 : ");
				str[i][1] = sc.next();
				
				System.out.print("영어 : ");
				str[i][2] = sc.next();
				
				System.out.println("-----------");
				
			
			
		}
		
		
		System.out.println(str.length+"명 등록완료");
		for (int i = 0; i < str.length; i++) {
			for ( int j = 0; j < str[i].length; j++) {
				System.out.println(str[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
	
	}
}
