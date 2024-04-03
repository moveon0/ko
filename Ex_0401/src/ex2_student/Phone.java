package ex2_student;

public class Phone {
	String brand;
	int series;
	String color = "검정색";
	
	//자바에선 생성자를 여러 개 선언하는 것을 허용하고 있다.s
	
	public Phone(String b, int s, String c) {
		this(b,s);//생성자의 첫번째에만 가능
		color = c;
	}
	//this()
	//현재 클래스에 선언되어있는 생성자를 가리킬 수 있는 키워드
	public Phone(String b, int s) {
		brand = b;
		series = s;
	}
	
	public void phoneInfo() {
		System.out.println(color + " " + brand + " " + series);
	}
}
