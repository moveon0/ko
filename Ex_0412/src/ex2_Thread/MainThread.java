package ex2_Thread;
//스레드 우선순위 10이 첫번째 1이 마지막 , default: 5
public class MainThread {
	public static void main(String[] args) {
		ThreadInfo ti = new ThreadInfo();
		ti.start();
		
		System.out.println("현재 실행되고 있는 스레드 이름 : " + Thread.currentThread().getName());
		System.out.println("현재 실행되고 있는 스레드 상태 : " + Thread.currentThread().getState());
		System.out.println("현재 실행되고 있는 스레드의 우선순위 : "+ Thread.currentThread().getPriority());
	}
}
