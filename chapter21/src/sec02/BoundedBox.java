package sec02;

class Box4<T extends Number> {                    // 제네릭 클래스의 타입 인자 제한
    private T ob;

    public T getOb() {
        return ob;
    }

    public void setOb(T o) {
        this.ob = o;
    }
}

public class BoundedBox {
    public static void main(String[] args) {
        Box4<Integer> iBox = new Box4<>();        // Integer는 Number를 상속
        iBox.setOb(24);

        Box4<Double> dBox = new Box4<>();         // Double은 Number를 상속
        dBox.setOb(5.97);

        System.out.println(iBox.getOb());
        System.out.println(dBox.getOb());
    }
}
