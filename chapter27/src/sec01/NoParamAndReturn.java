package sec01;

import java.util.Random;

interface Generator {
    int rand(); // 매개변수 없는 메소드
}

class NoParamAndReturn {
    public static void main(String[] args) {
        Generator gen = () -> {
            Random rand = new Random();     // 문장이 2 이상일 경우, 중괄호와 return문 반드시 사용
            return rand.nextInt(50);
        };

        System.out.println(gen.rand());
    }
}