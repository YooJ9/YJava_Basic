package sec01;

@FunctionalInterface
interface Calculate3<T> {   // 제네릭 기반의 함수형 인터페이스
    T cal(T a, T b);
}

public class LambdaGeneric {
    public static void main(String[] args) {
        Calculate3<Integer> ci = (a, b) -> a + b;
        System.out.println(ci.cal(4, 3));

        Calculate3<Double> cd = (a, b) -> a + b;
        System.out.println(cd.cal(4.32, 3.45));
    }
}