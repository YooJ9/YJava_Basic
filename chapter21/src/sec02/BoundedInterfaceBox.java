package sec02;

interface Eatable {
    public String eat();
}

class Apple implements Eatable {
    public String toString() {
        return "I am an apple.";
    }

    @Override
    public String eat() {
        return "It tastes so goood!";
    }
}

class Box9<T extends Eatable> {
    T ob;

    public T get() {
        System.out.println(ob.eat());   // Eatable로 제한하였기에 eat 호출 가능 !!
        return ob;
    }

    public void set(T o) {
        this.ob = o;
    }
}

public class BoundedInterfaceBox {
    public static void main(String[] args) {
        Box9<Apple> box = new Box9<>();
        box.set(new Apple());           // 사과 저장

        Apple ap = box.get();
        System.out.println(ap);         // 사과 꺼내기
    }
}
