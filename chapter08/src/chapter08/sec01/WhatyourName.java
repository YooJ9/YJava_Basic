package chapter08.sec01;

class AAA {
    public void showName() {
        System.out.println("my name is AAA");
    }
}

class ZZZ {
    public void showName() {
            System.out.println("my name is ZZZ");
    }
}

public class WhatyourName {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        aaa.showName();

        ZZZ zzz =new ZZZ();
        zzz.showName();
    }
}
