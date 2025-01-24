package sec02;

class DBox1<L, R> {
    private L left;
    private R right;

    public void set(L o, R r) {
        left = o;
        right = r;
    }
    public String toString() { return left + " & " + right; }
}

class DDBox<U, D> {
    private U up;
    private D down;

    public void set(U u, D d) {
        up = u;
        down = d;
    }
    public String toString() { return up + "\n" + down; }
}

public class DDBoxMain {
    public static void main(String[] args) {
        DBox1<String, Integer> box1 = new DBox1<>();
        box1.set("Apple", 25);

        DBox1<String, Integer> box2 = new DBox1<>();
        box2.set("Orange", 33);
        DDBox<DBox1<String, Integer>, DBox1<String, Integer>> ddbox = new DDBox<>();
        ddbox.set(box1, box2);          // 두 개의 상자를 하나의 상자에 담음
        System.out.println(ddbox);      // 상자의 내용물 출력

    }
}
