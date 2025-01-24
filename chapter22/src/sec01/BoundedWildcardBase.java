package sec01;

class Box6<T> {
    private T ob;
    public T get() {
        return ob;
    }
    public void set(T o) {
        this.ob = o;
    }
}

class Toy {
    @Override
    public String toString() {
        return "I am a  Toy";
    }
}

class BoxHandler {
    public static void outBox(Box6<Toy> box) {
        Toy t = box.get();  // 상자에서 꺼내기
        System.out.println(t);
    }
    public static void inBox(Box6<Toy> box, Toy n) {
        box.set(n);         // 상자에 넣기
    }
}

public class BoundedWildcardBase {
    public static void main(String[] args) {
        Box6<Toy> box = new Box6<>();
        BoxHandler.inBox(box, new Toy());
        BoxHandler.outBox(box);
    }
}