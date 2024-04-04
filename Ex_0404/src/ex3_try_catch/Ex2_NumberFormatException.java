package ex3_try_catch;

public class Ex2_NumberFormatException {
	public static void main(String[] args) {
		//NumberFormatException
		//잘못된 문자열을 숫자로 형변환하려고 할 때 발생
		String str01 = "11";
		String str02 = "11.2";
		
		int num01 = Integer.parseInt(str01);
		System.out.println("String to int : "+ num01);
		
		int num02 = Integer.parseInt(str02);
		System.out.println("String to int : " + num02);
	}
}
