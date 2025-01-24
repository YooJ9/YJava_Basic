package sec03;

interface Getable1<T> {
    public T get();
}

class Box9<T> implements Getable1<String> {
    private T ob;
    public void set(T o) {
        this.ob = o;
    }

    @Override
    public String get() {
        return ob.toString();
    }   // 반환형은 T가 아닌 String이어야 한다.
}

class Toy2 {
    @Override
    public String toString() {
        return "I am a Toy";
    }
}

public class GetableGenericInterface2 {
    public static void main(String[] args) {
        Box9<Toy> box = new Box9<>();
        box.set(new Toy());

        // Box<T>가 Getable<T>를 구현하므로 참조 가능
        Getable1<String> gt = box;
        System.out.println(gt.get());
    }
}
