package ex1_getter_setter;

public class CarMain {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(50);
		System.out.println("현재속도 : "+myCar.getSpeed());
		
		myCar.setSpeed(-50);
		System.out.println("현재속도 : "+myCar.getSpeed());
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재속도 : "+myCar.getSpeed());
	}
}
