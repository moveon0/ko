package ex5_work;
import java.util.Scanner;
//스캐너를 이용하여 키보드에서 숫자를 입력받고 
//ThreadCount클래스를 스레드로 만들어서 입력받은 숫자가 1씩 감소하다가 
//0이 되었을 때 종료 메시지와 함께 프로그램을 종료하세요



public class ThreadCountMain {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("정수 입력 : ");
		 int number = sc.nextInt();
	        sc.close();

	        ThreadCount counter = new ThreadCount(number);
	        counter.start();
		
		
		
	}
	
}
