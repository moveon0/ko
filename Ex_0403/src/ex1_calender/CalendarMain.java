package ex1_calender;

public class CalendarMain {
	public static void main(String[] args) {
		DeskCalendar dc = new DeskCalendar("보라색",6);
		dc.info();
		dc.hanging();
		dc.onTheDesk();
		
		System.out.println();
		
		Calendar c = new DeskCalendar("검은색",12);
		
		c.info();
		c.hanging();
		//c.onTheDesk(); 상속받으면 자동형변환으로 자기 클래스에서 만든 메서드는 사용 불가
		
		
		/*
		 * 클래스의 강제 타입 변환
		 * 
		 * 부모타입으로 변환했지만 자식클래스의 멤버에 접근하고 싶을 때가 생길 수 있다.
		 * 자바의 규약으로 자식 클래스의 멤버에 접근할 수 없으므로 이러한 경우 
		 * 자식타입으로 변경해서 접근할 수 있도록 해야 한다.
		 * 부모타입으로 변환 후 다시 자식타입으로 변환하는 것을 말한다.
		 * 
		 * 일회성으로 타입 변환이 필요할 때
		 * 
		 * ((자식타입)객체).메서드명();
		 * 
		 * 자식클래스의 멤버에 접근이 여러 번 필요한 경우
		 * 변수명 = (자식타입)객체;
		 */
	}
}
