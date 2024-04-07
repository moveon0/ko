package ex2_bike;

public class BikeMain {
	public static void main(String[] args) {
		Bike b = new FourWheelBike("윤기");
		b.info();
		b.ride();
		//b.add();
		
		FourWheelBike fwb = (FourWheelBike)b;//부모타입 객체를 다시 자식타입 객체로 강제형변환하여 사용
		fwb.info();
		fwb.ride();
		fwb.addWheel();
	}
}
