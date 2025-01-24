package sec02;

class Box<T> {
    private T ob;

    public void set(T o) {
        ob = o;
    }

    public T get() {
        return ob;
    }
}

public class PrimitivesAndGeneric {
    public static void main(String[] args) {
        Box<Integer> iBox = new Box<Integer>();
        iBox.set(125);                              // 오토 박싱 진행
        int num = iBox.get();                       // 오토 언박싱 진행
        System.out.println(num);

    }
}
