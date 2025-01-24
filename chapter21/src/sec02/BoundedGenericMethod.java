package sec02;

class Boxx3<T> {
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T o) {
        ob = o;
    }
}

class BoxFactory2 {
    public static <T extends Number> Boxx3<T> makeBox(T o) {
        Boxx3<T> box = new Boxx3<T>();
        box.set(o);

        System.out.println("Boxed data: " + o.intValue());
        return box;
    }
}

class Unboxer2 {
    public static <T extends Number> T openBox(Boxx3<T> box) {
        System.out.println("Unboxed data: " + box.get().intValue());
        return box.get();
    }
}

class BoundedGenericMethod {
    public static void main(String[] args) {
        Boxx3<Integer> sBox = BoxFactory2.makeBox(5959);
        int n = Unboxer2.openBox(sBox);
        System.out.println("Returned data: " + n);
    }
}
