package ex5_work;
//s
public class ThreadCount extends Thread {
    private int count;

    public ThreadCount(int count) {
        this.count = count;
    }

    public void run() {
        while (count > 0) {
            System.out.println("현재 카운트: " + count);
            count--;
            try {
                Thread.sleep(1000); // 1초마다 카운트 감소
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("카운트가 0이 되어 종료합니다.");
        System.exit(0);
    }
}
