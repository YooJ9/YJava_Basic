class Box5<T> {
    private T ob;
    public T get() {
        return ob;
    }

    public void set(T o) {
        this.ob = o;
    }

    @Override
    public String toString() {
        return ob.toString();
    }
}

class UnBoxer3 {
    // 상한 제한된 와일드 카드
    public static void peekBox(Box5<? extends Number> box) {
        System.out.println(box);
    }
}

public class UpperBoundedWildcard {
    public static void main(String[] args) {
        Box5<Integer> iBox = new Box5<>();
        iBox.set(1234);
        Box5<Double> dBox = new Box5<>();
        dBox.set(10.009);

        UnBoxer3.peekBox(iBox);
        UnBoxer3.peekBox(dBox);
    }

}
