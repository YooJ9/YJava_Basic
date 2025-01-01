package sec03;

class Box2 {
    public void Wrap2() {
        System.out.println("Simple Wrapping");
    }
}

class PaperBox2 extends Box2 {
    public void Wrap2() {
        System.out.println("Paper Wrapping");
    }
}

class GoldPaperBox2 extends PaperBox2 {
    public void Wrap2() {
        System.out.println("Gold Wrapping");
    }
}

class WrappingGood {
    public static void main(String[] args) {
        Box2 box1 = new Box2();
        PaperBox2 box2 = new PaperBox2();
        GoldPaperBox2 box3 = new GoldPaperBox2();

        wrapBox2(box1);
        wrapBox2(box2);
        wrapBox2(box3);
    }

    public static void wrapBox2(Box2 box) {
        box.Wrap2();
    }
}
