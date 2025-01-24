package sec01;

class Box8<T> {
    private T ob;
    public T get() {
        return ob;
    }
    public void set(T o) {
        this.ob = o;
    }
}

class Toy3 {
    @Override
    public String toString() {
        return "I am a  Toy";
    }
}

class BoxHandler3 {
    public static void outBox(Box8<? extends Toy> box) {    // 상한 제한(set 호출 불가) -> 안전성 올라감
        Toy t = box.get();  // 상자에서 꺼내기
        System.out.println(t);
    }
    public static void inBox(Box8<? super Toy> box, Toy n) {

        box.set(n);  // 상자에 넣기
    }
}

public class BoundedWildcardUsage2 {
    public static void main(String[] args) {
        Box8<Toy> box = new Box8<>();
        BoxHandler3.inBox(box, new Toy());
        BoxHandler3.outBox(box);
    }
}