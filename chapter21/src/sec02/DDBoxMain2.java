package sec02;

class DBox2<L, R> {
    private L left;
    private R right;

    public void set(L o, R r) {
        left = o;
        right = r;
    }
    public String toString() { return left + "\n" + right; }
}

public class DDBoxMain2 {
    public static void main(String[] args) {
        DBox1<String, Integer> box1 = new DBox1<>();
        box1.set("Apple", 25);

        DBox1<String, Integer> box2 = new DBox1<>();
        box2.set("Orange", 33);

        System.out.println(box1);
        System.out.println(box2);

    }
}
