package sec01;

class Apple4 {
    public String toString() {
        return "I am an apple.";
    }
}

class Orange4 {
    public String toString() {
        return "I am an orange.";
    }
}

class Box3 {
    private Object ob;

    public void set(Object o) {
        ob = o;
    }

    public Object get() {
        return ob;
    }
}


public class FruitAndBoxFault2 {
    public static void main(String[] args) {
        Box6 aBox6 = new Box6();
        Box6 oBox6 = new Box6();

        // 다음 두 문장은 프로그래머의 실수이다!
        aBox6.set("Apple");
        oBox6.set("Orange");

        System.out.println(aBox6.get());
        System.out.println(oBox6.get());
    }
}
