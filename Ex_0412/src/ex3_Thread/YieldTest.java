package ex3_Thread;



class Producer implements Runnable{
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("Producer: " + i);
			Thread.yield();
		}
	}
}
class Consumer implements Runnable{
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("Consumer: " +i);
		}
		
	}
}
public class YieldTest {
	public static void main(String[] args) {
		Thread producerThread = new Thread (new Producer());
		Thread consumerThread = new Thread (new Consumer());
		
		producerThread.start();
		consumerThread.start();
	}
}
