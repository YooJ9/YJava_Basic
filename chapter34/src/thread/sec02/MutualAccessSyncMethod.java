package thread.sec02;

class Counter2 {
    int count = 0;

    public synchronized void increment() {      // synchronized 선언
        count++;
    }
    public synchronized void decrement() {      // synchronized 선언 (두 메소드 동시 실행 불가)
        count--;
    }
    public int getCount() {
        return count;
    }
}

public class MutualAccessSyncMethod {

    public static Counter2 cnt = new Counter2();

    public static void main(String[] args) throws InterruptedException {
        Runnable task1 = () -> {
            for (int i = 0; i < 1000; i++) {
                cnt.increment();
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 1000; i++) {
                cnt.decrement();
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(cnt.getCount());
    }
}
