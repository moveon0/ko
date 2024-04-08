package ex4_Calendar;

import java.util.Calendar;

public class Ex1_Calendar {
	public static void main(String[] args) {
		//java.util패키지에 있는 날짜와 시간 정보를 제공하는 클래스
		//객체를 만들 때 new 키워드를 이용하여 선언하지 않고 생성된 객체를 받아오는 식으로 선언한다.ㄴ
		
		Calendar cal = Calendar.getInstance();
		
		//년도
		int year = cal.get(Calendar.YEAR);
		
		//월 (0 - 11)
		int month = cal.get(Calendar.MONTH)+1;
		
		//현재 달의 몇 번째 날인지 나타내는 상수 (1-31)
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("오늘 날짜는 " + year + "년 " + month + "월 " + day + "일 입니다.");
	}
}
