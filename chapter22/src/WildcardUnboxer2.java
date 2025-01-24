class Box4<T> {
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

class UnBoxer2 {
    public static <T> T openBox(Box4<T> box) {
        return box.get();
    }

    public static void peekBox(Box4<?> box) {
        System.out.println(box);
    }   //와일드 카드 사용
}

public class WildcardUnboxer2 {
    public static void main(String[] args) {
        Box4<String> box = new Box4<>();
        box.set("So Simple SString");
        UnBoxer2.peekBox(box);
    }
}
