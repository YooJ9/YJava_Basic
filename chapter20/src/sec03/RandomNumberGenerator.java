package sec03;

import java.util.Random;

class RandomNumberGenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        Random rand2 = new Random(12);

        for(int i = 0; i < 7; i++) {
            System.out.println(rand.nextInt(1000));
        }

        System.out.println("=====");

        for(int i = 0; i < 7; i++) {    // 씨드 값이 고정이여서, 같은 값 반환
            System.out.println(rand2.nextInt(1000));
        }
    }
}
