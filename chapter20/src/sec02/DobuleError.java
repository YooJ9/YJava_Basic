package sec02;

public class DobuleError {
    public static void main(String[] args) {
        double d1 = 1.6;
        double d2 = 0.1;
        System.out.println("덧셈 결과: " + (d1 + d2));
        System.out.println("곱셈 결과: " + (d1 * d2));      // 실수형으로 표현시 오차 발생
    }
}
