package ex2_calculator;

public class TimesTable {
	public void showTable(int n) {
		for (int i = 1; i <= 9;i++) {
			System.out.printf("%d * %d = %d\n",n,i,n * i);
			
		}		
	}
	//강사님 풀이
	
	public void showTable1(int n) {
		for ( int i = 1; i <10; i++) {
			System.out.printf("%d x %d = %d\n",n,i,n*i);
		}
	}
}
