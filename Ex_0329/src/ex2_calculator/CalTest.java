package ex2_calculator;

public class CalTest {
	private int su1,su2,result;
	private char op;
	
	public int getResult(int su1, int su2, char op) {
		
		switch(op) {
		case '+':
			result = su1 + su2;
			break;
		case '-':
			result = su1 - su2;
			break;
		case '*':
			result = su1 * su2;
			break;
		case '/':
			result = su1 / su2;
			break;
		}
		return result;
	}
	
	
	// 강사님 풀이
	
	public void getResult1(int x, int y, String op) {
		switch(op) {
		case "+":
			System.out.printf("%d + %d = %d\n",x,y,x+y);
			break;
		case "-":
			System.out.printf("%d - %d = %d\n",x,y,x-y);
			break;
		case "*":
			System.out.printf("%d * %d = %d\n",x,y,x*y);
			break;
		case "/":
			System.out.printf("%d / %d = %d\n",x,y,x/y);
			break;
		}
	}
	
	
	
	
}
