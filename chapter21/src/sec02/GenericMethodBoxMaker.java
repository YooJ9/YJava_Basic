package sec02;

class Boxx<T> {
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
}

class BoxFactory {
    public static <T> Boxx<T> makeBox(T o) {     // 제네릭 메소드의 정의
        Boxx<T> box = new Boxx<>();               // 상자를 생성하고,
        box.set(o);                             // 전달된 인스턴스를 상자에 담아서,
        return box;                             // 이 상자를 반환한다.
    }
}

public class GenericMethodBoxMaker {
    public static void main(String[] args) {
        Boxx<String> sBox = BoxFactory.makeBox("sweet");
        System.out.println(sBox.get());

        Boxx<Double> dBox = BoxFactory.makeBox(7.59);
        System.out.println(dBox.get());

    }
}
