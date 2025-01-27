package sec01;

interface Calculator<T> {
    T cal(T a, T b);
}

class CalculatorDemo {
    public static <T> void CalAndShow(Calculator<T> op, T n1, T n2) {
        T r = op.cal(n1, n2);
        System.out.println(r);
    }
    public static void main(String[] args) {
        CalAndShow((a, b) -> a + b, 3, 4);
        CalAndShow((a, b) -> a + b, 2.5, 7.1);
        CalAndShow((a, b) -> a - b, 4, 2);
        CalAndShow((a, b) -> a - b, 4.9, 3.2);
    }
}