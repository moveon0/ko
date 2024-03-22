package ex1_if;
import java.util.Scanner;
public class Ex3_if_elseif_else {
	public static void main(String[] args) {
		//if - else if - else
		//비교할 조건이 여러 개 있는 경우 사용.
		
		//기본형
		//if(조건식1) {
		// 조건식1이 참일때 실행할 명령
		//} else if(조건식 2){
		// 조건식1이 거짓이고 조건식2가 참일때 실행할 명령
		//} else {
		//	위 조건이 모두 거짓일 때 실행할 명령
		//}
		
		int favorite = 7;
		
		if (favorite <5) {
			System.out.println("좋아하는 숫자가 5보다 작습니다.");
		} else if(favorite > 5) {
			System.out.println("좋아하는 숫자가 5보다 큽니다.");
		} else {
			System.out.println("좋아하는 숫자는 5입니다.");
		}
		//효율적인 제어를 위해 if문과 elseif문의 조건문 위치를 바꿔야함.
		
		System.out.println("-------------");
		//나이를 입력받아 20살 이상이면 "성인입니다."
		//13살보다 많으면 "청소년입니다."
		//6보다 많으면 "어린이입니다."
		//그 외엔 "유아입니다." 출력
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if (age >= 20) {
			System.out.println("성인입니다.");
		} else if (13< age && age < 20) {
			System.out.println("청소년입니다.");
		} else if (6 < age && age <13) {
			System.out.println("어린이입니다.");
		} else {
			System.out.println("유아입니다.");
		}
		*/
		System.out.println("------------");
		
		//성적을 입력받고
		// 90점 이상 A
		// 80점 이상 B
		// 70점 이상 C
		// 60점 이상 D
		// 59점 이하 F
		char grade;
		System.out.println("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		if (score >=90) {
			grade='A';
		} else if (score >=80){
			grade='B';
		} else if (score >=70) {
			grade='C';
		} else if (score >=60) {
			grade='D';
		} else {
			grade='F';
		}
		System.out.println(grade + "등급입니다.");
		
	}
}
