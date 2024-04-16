package ex2_Thread;
/*
 * -프로세스s
 * 컴퓨터에 저장된 파일을 실행하는 순간 메모리에 올라가고 동작하는데 이 상태를 말한다.
 * 프로세스는 독립적으로 메모리에 등록되므로 여러 개의 프로그램을 동시에 실행할 수 있다.
 * 
 * -스레드
 * 프로세스 내부에 존재하면서 실행 흐름을 나타내는 것
 * 
 * -프로세스가 실행하는 방식
 * 1. 시간 분할 방식
 * 	모든 프로세스에 동일한 시간을 할당하고 골고루 실행하는 방식
 * 2. 선점형 방식
 * 	각각의 프로세스에게 우선순위를 부여하고 높은 순으로 실행하는 방식
 * 
 * jvm이 스레드 처리시 하는 일
 * 스레드 스케쥴링
 * 스레드가 몇 개 존재하는지 파악
 * 스레드가 실행되는 프로그램 코드의 메모리 위치가 어딘지
 * 현재 스레드 상태는 무엇인지
 * 스레드의 우선순위는 몇인지
 * 
 * 개발자가 스레드 처리시 하는 일
 * 자바 스레드로 작동할 작업이 무엇인지 코드로 작성
 * 스레드 코드가 실행할 수 있도록 JVM에게 요청
 * 
 * Thread클래스의 주요 메서드
 * static Thread currentThread(): 현재 수행되는 스레드 객체를 반환
 * String getName(): 스레드의 이름을 반환
 * void setName(): 스레드의 이름을 지정
 * int getPriority(): 스레드의 우선순위를 반환
 * void setPriority(int priority): 스레드의 우선순위를 지정
 * void start(): 스레드를 시작
 * 
 * -스레드의 상태
 * 스레드는 생성하고 실행, 종료되기까지 다양한 상태를 가진다.
 * 각 스레드의 상태는 스레드 클래스에 정의되어 있으며, Thread.State 타입으로 알 수 있다.
 * 스레드의 상태에 따라 6개의 타입으로 분류하고 있다.
 * 
 * 생성		new			스레드 객체가 생성되었지만 아직 start 메서드가 호출되지 않은 상태
 * 대기 		Runnable	실행 대기 또는 실행 상태로 언제든지 갈 수 있는 상태
 * 일시정지	Waiting		다른 스레드가 종료할 때까지 대기하는 상태
 * 			Time_Wating 주어진 시간동안 대기하는 상태
 * 			BLOCKED		락이 풀릴 때까지 대기하는 상태
 * 종료		Terminated	수행을 종료한 상태
 * 
 * 
 * 1. new 와 Runnable, Terminated
 * 처음 스레드가 생성되면 new 상태가 된다.
 * 생성 이후에 start메서드를 실행하면 스레드는 Runnable 상태로 변하고
 * 시작 이후에 스레드가 조율되면 Terminated상태가 된다.
 * 
 * 2. Wait
 * 스레드 Wait 상태는 필요에 의해서 스레드를 잠시 멈춤 상태로 두는 것
 * 스레드를 잠시 멈춤 상태로 만들 때는 일정 시간을 지정하거나, 멈춤 상태의 락이 풀릴 때까지
 * 대기하도록 할 수 있다.
 * 
 * 상태변화 메서드
 * static void sleep(long millis) 	millisecond에 지정된 시간만큼 대기
 * void join() 						현재 스레드는 join메서드를 호출한 스레드가 종료될 때까지 대기
 * static void yield() 				수행중인 스레드 중 우선순위가 같은 스레드에게 제어권을 넘긴다.
 * 
 * -wait()과 notify()
 * 
 * 여러 개의 스레드가 동시에 동작하다보면 하나의 스레드가 완료되어야 
 * 다음 스레드가 동작할 수 있는 경우가 있다.
 * 
 * wait()메서드는 스레드를 대기시키고
 * notify()메서드는 대기 중인 스레드를 다시 동작시킬 때 사용한다.
 * 
 * 
 * yield()메서드
 * 스레드가 자신에게 주어진 실행시간을 다음 차례의 스레드에게 양보
 * 예를 들어 스케쥴러에 의해 1초의 실행시간을 할당받은 스레드가 0.5초의 시간동안 작업한 상태에서
 * yield가 호출되면 나머지 0.5초는 포기하고 다시 실행상태가 된다.
 * 
 * -데몬스레드
 * 다른 일반 스레드의 작업을 돕는 보조적인 스레드
 * 함께 구동 중인 일반 스레드가 종료되면 데몬스레드도 함께 종료된다.
 * 문서작성을 하는 도중 3초 간격으로 자동저장
 */






//스레드 생성 방법 1
class ThreadTest extends Thread{
	@Override
	public void run() {
		//작업할 내용 
		for(int i =0; i<10; i++) {
			System.out.println("스레드 진행 중: " + i);
		}
	}
}
//스레드 생성 방법 2
class RunnableTest implements Runnable{
	@Override
	public void run() {
		// 작업할 내용
		for(int i =0; i<10; i++) {
			System.out.println("러너블 진행 중: " + i);
		}
	}
}
public class ThreadMain {
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		tt.start();
		//run()을 직접 호출하게되면 독립적으로 수행하지 못한다.
		//일반메서드처럼 호출한다.
		//그래서 독립적으로 사용하고 싶다면 start메서드를 사용해야 한다.
		
		RunnableTest rt = new RunnableTest();
		Thread t1 = new Thread(rt);
		t1.start();
		
		//Runnable 인터페이스를 직접 구현하지 않고 람다식으로 표현가능
		
		Thread t2 = new Thread(() -> {
			while(true) {
				System.out.println("백기 올려");
			}
		});
		t2.start();
		
		Thread t3 = new Thread(()->{
			while(true) {
				System.out.println("청기 올려");
			}
		});
		t3.start();
		
	}
}
