class Box6<T> {
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

class UnBoxer4 {
    // 하한 제한된 와일드 카드
    public static void peekBox(Box6<? super Integer> box) {
        System.out.println(box);
    }
}

public class LowerBoundedWildcard {
    public static void main(String[] args) {
        Box6<Integer> iBox = new Box6<>();
        iBox.set(5577);
        Box6<Number> nBox = new Box6<>();
        nBox.set(9955);
        Box6<Object> oBox = new Box6<>();
        oBox.set("My Simple Instance");

        UnBoxer4.peekBox(iBox);
        UnBoxer4.peekBox(nBox);
        UnBoxer4.peekBox(oBox);
    }

}