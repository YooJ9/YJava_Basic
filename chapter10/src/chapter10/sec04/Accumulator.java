package chapter10.sec04;

public class Accumulator {
    static int sum = 0;


    static void add(int a) {
        sum += a;
    }
    static void showResult() {
        System.out.println("sum = " + sum);
    }

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            Accumulator.add(i);
            Accumulator.showResult();
        }
    }
}
