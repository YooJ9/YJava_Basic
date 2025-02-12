package thread.sec02;

class Counter {
    int count = 0;  // 공유되는 변수

    public void increment() {
        count++;    // 첫 번째 쓰레드에 의해 실행
    }
    public void decrement() {
        count--;    // 두 번째 쓰레드에 의해 실행
    }
    public int getCount() {
        return count;
    }
}

public class MutualAccess {

    public static Counter cnt = new Counter();

    public static void main(String[] args) throws InterruptedException {
        Runnable task1 = () -> {
            for (int i = 0; i < 1000; i++) {
                cnt.increment();    // 값을 1 증가
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 1000; i++) {
                cnt.decrement();    // 값을 1 감소
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        t1.join();  // t1이 참조하는 쓰레드의 종료를 기다림
        t2.join();  // t2가 참조하는 쓰레드의 종료를 기다림

        /*
        동기화 : 한 쓰레드가 특정 메모리 공간에 접근하여 작업할 때,
                 다른 쓰레드의 접근을 막는 것
         */

        System.out.println(cnt.getCount());
    }
}
