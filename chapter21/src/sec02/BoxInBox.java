package sec02;

class Box3<T> {
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T o) {
        ob = o;
    }
}

public class BoxInBox {
    public static void main(String[] args) {
        Box<String> sBox = new Box<>();
        sBox.set("I am so happy.");

        Box<Box<String>> wBox = new Box<>();
        wBox.set(sBox);

        Box<Box<Box<String>>> zBox = new Box<>();
        zBox.set(wBox);

        System.out.println(zBox.get().get().get());
    }
}
