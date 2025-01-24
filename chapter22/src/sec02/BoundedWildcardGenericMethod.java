package sec02;

class Box9<T> {
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T o) {
        this.ob = o;
    }
}

class Toy5 {
    @Override
    public String toString() {
        return "I am a Toy";
    }
}

class Robot {
    @Override
    public String toString() {
        return "I am a Robot";
    }
}

class BoxHandler2 {
    public static <T> void outBox(Box9<? extends T> box) {
        T t = box.get();
        System.out.println(t);
    }

    public static <T> void inBox(Box9<? super T>box, T n) {
        box.set(n);
    }
}

public class BoundedWildcardGenericMethod {
    public static void main(String[] args) {
        Box9<Toy> tBox = new Box9<>();
        BoxHandler2.inBox(tBox, new Toy());
        BoxHandler2.outBox(tBox);

        Box9<Robot> rBox = new Box9<>();
        BoxHandler2.inBox(rBox, new Robot());
        BoxHandler2.outBox(rBox);
    }
}
