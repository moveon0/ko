package ex4_static;
//s
public class BankMain {
	public static void main(String[] args) {
		Bank b1 = new Bank("부평","032-111-1111");
		Bank b2 = new Bank("강남","02-2222-2222");
		Bank b3 = new Bank("대전","042-333-3333");
		
		Bank.interest = 1f;
		
		
		
		b1.printBank();
		b2.printBank();
		b3.printBank();
	}
}
