package thread.sec02;

class Counter3 {
    int count = 0;

    public void increment() {
        synchronized (this) {   // 동기화 블럭
            count++;
        }
    }
    public void decrement() {
        synchronized (this) {   // 동기화 블럭 (불필요한 동기화를 막음)
            count--;
        }
    }
    public int getCount() {
        return count;
    }
}

class MutualAccessSyncBlock {

    public static Counter3 cnt = new Counter3();

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
