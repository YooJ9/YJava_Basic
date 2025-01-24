class Box2<T> {
    private T ob;
    public void set(T o) {
        ob = o;
    }
    public T get() {
        return ob;
    }
}

class EmptyBoxFactory {
    public static <T> Box<T> makeBox() {    // 제네릭 메소드
        Box<T> box = new Box<T>();          // 상자 생성
        return box;                         // 생성한 상자 반환
    }
}

class TargetTypes {
    public static void main(String[] args) {
        // 타겟 타입
        Box<Integer> iBox = EmptyBoxFactory.makeBox();  // 메소드 호출문
        // Box<Integer> iBox = EmptyBoxFactory.<Integer>makeBox();
        iBox.set(25);
        System.out.println(iBox.get());
    }
}