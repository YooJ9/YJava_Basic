class Box3<T> {
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

class UnBoxer {
    public static <T> T openBox(Box3<T> box) {
        return box.get();
    }

    // 상자 안의 내용물을 확인하는(출력하는) 기능의 제네릭 메소드
    public static <T> void peekBox(Box3<T> box) {
        System.out.println(box);
    }
}

public class WildcardUnboxer {
    public static void main(String[] args) {
        Box3<String> box = new Box3<>();
        box.set("So Simple SString");
        UnBoxer.peekBox(box);                   // 상자 안의 내용물을 확인해본다.
    }
}
