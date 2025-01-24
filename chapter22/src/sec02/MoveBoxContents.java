package sec02;

import javax.swing.text.html.StyleSheet;

class Box<T> {
    private T ob;
    public void set(T o) {
        ob = o;
    }

    public T get() {
        return ob;
    }
}

class Toy {
    @Override
    public String toString() {
        return "I am a Toy";
    }
}

class BoxContentsMover {
    // from에 저장된 내용물을 to로 이동
    public static void moveBox(Box<? super Toy> to, Box<? extends Toy> from) {
        to.set(from.get());
    }
}

class MoveBoxContents {
    public static void main(String[] args) {
        Box<Toy> box1 = new Box<>();
        box1.set(new Toy());
        Box<Toy> box2 = new Box<>();

        // box1에 저장된 내용물 box2로 이동
        BoxContentsMover.moveBox(box2, box1);
        System.out.println(box2.get());
    }
}
