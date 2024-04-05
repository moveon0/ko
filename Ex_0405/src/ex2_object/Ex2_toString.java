package ex2_object;

//toString()메서드
//객체의 문자 정보를 반환해주는 메서드
//print()문을 사용해 객체를 출력할 경우 해당 메서드가 자동으로 실행되어
//객체의 정보를 반환해주고 출력한다.
//따라서 해당 메서드를 재정의해서 사용하면 원하는 객체의 정보를 쉽게 출력할 수 있다.
class Car{
	private String carName;
	private String company;
	
	public Car(String carName, String company) {
		this.carName = carName;
		this.company = company;
	}
	
	@Override//Object를 자동으로 상속받아 extends 를 안써도 오버라이딩할 수 있음.
	public String toString() {
		String str = "차량 이름 :" + carName +", 제조사 : " + company;
		return str;
	}
	
}
public class Ex2_toString {
	public static void main(String[] args) {
		Car car = new Car("소나타", "현대");
		System.out.println(car);
	}
}
