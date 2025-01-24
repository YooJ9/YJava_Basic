package sec01;

class Apple2 {
    public String toString() {
        return "I am an apple.";
    }
}

class Orange2 {
    public String toString() {
        return "I am an orange.";
    }
}

class Box6 {                    // 무엇이든 담을 수 있는 상자
    private Object ob;

    public void set(Object o) {
        ob = o;
    }

    public Object get() {
        return ob;
    }
}


public class FruitAndBox2 {
    public static void main(String[] args) {
        Box6 aBox6 = new Box6();         // 상자 생성
        Box6 oBox6 = new Box6();       // 상자 생성

        aBox6.set(new Apple());                  // 상자에 사과를 담는다.
        oBox6.set(new Orange());                 // 상자에 오렌지를 담는다.

        Apple ap = (Apple) aBox6.get();                  // 상자에서 사과를 꺼낸다.
        Orange og = (Orange) oBox6.get();                 // 상자에서 오렌지를 꺼낸다.

        System.out.println(ap);
        System.out.println(og);
    }
}
