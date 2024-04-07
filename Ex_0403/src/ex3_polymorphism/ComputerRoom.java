package ex3_polymorphism;

	public class ComputerRoom {
		//SamSung com1;
		//SamSung com2;
		//객체를 부모타입으로 선언해 메인에서만 수정하면 됨.
		Computer com1;
		Computer com2;
	
	public void allPowerOn() {
		com1.powerOn();
		com2.powerOn();
	
		}
	public void allPowerOff() {
		com1.powerOff();
		com2.powerOff();
	}
}