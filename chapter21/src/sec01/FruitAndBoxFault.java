package sec01;

class Apple3 {
    public String toString() {
        return "I am an apple.";
    }
}

class Orange3 {
    public String toString() {
        return "I am an orange.";
    }
}

class Box2 {
    private Object ob;

    public void set(Object o) {
        ob = o;
    }

    public Object get() {
        return ob;
    }
}


public class FruitAndBoxFault {
    public static void main(String[] args) {
        Box6 aBox6 = new Box6();
        Box6 oBox6 = new Box6();

        // 아래 두 문장에서는 사과와 오렌지가 아닌 '문자열'을 담았다.
        aBox6.set("Apple");
        oBox6.set("Orange");

        // 상자에 과일이 담기지 않았는데 과일을 꺼내려 한다.
        Apple ap = (Apple) aBox6.get();
        Orange og = (Orange) oBox6.get();

        System.out.println(ap);
        System.out.println(og);
    }
}
