package ex5_phone;

public class Phone {
	String brand;
	int series;
	String color = "검정색";
	
	public Phone(String b, int s, String c) {
		brand = b;
		series = s;
		color = c;
	}
	
	public void phoneInfo() {
		System.out.println(color + " " + brand + " " + series);
	}
}
