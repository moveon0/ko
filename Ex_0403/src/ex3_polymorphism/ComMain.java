package ex3_polymorphism;

public class ComMain {
	public static void main(String[] args) {
		ComputerRoom cr = new ComputerRoom();
		cr.com1 = new SamSung();
		cr.com2 = new LZ();
		cr.allPowerOn();
		cr.allPowerOff();
	}
}
