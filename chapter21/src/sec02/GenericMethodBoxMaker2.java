package sec02;

class Boxx2<T> {
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
}

class Unboxer {
    public static <T> T openBox(Boxx2<T> box) {
        return box.get();
    }
}

public class GenericMethodBoxMaker2 {
    public static void main(String[] args) {
        Boxx2<String> box = new Boxx2<>();
        box.set("My Generic Method");

        String str = Unboxer.openBox(box);      // Unboxer.<String>openBox(box); 생략이 일반적 이다.
        System.out.println(str);
    }
}
