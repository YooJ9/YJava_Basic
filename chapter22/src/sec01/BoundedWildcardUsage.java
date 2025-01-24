package sec01;

class Box7<T> {
    private T ob;
    public T get() {
        return ob;
    }
    public void set(T o) {
        this.ob = o;
    }
}

class Toy2 {
    @Override
    public String toString() {
        return "I am a  Toy";
    }
}

class BoxHandler2 {
    public static void outBox(Box7<? extends Toy> box) {            // 상한 제한(set 호출 불가) -> 안전성 올라감
        Toy t = box.get();  // 상자에서 꺼내기
        System.out.println(t);
    }
    public static void inBox(Box7<Toy> box, Toy n) {
        box.set(n);  // 상자에 넣기
    }
}

public class BoundedWildcardUsage {
    public static void main(String[] args) {
        Box7<Toy> box = new Box7<>();
        BoxHandler2.inBox(box, new Toy());
        BoxHandler2.outBox(box);
    }
}