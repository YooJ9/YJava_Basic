package sec02;

class Cake1 {
    public void yummy() {
        System.out.println("Yummy Cake");
    }
}

class CheeseCake1 extends Cake1 {
    public void yummy() {           // Cake의 yummy 메소드를 오버라이딩 함
        System.out.println("Yummy CheeseCake");
    }
}

class YummyCakeOverriding {
    public static void main(String[] args) {
        Cake1 c1 = new CheeseCake1();
        CheeseCake1 c2 = new CheeseCake1();

        c1.yummy();
        c2.yummy();
    }
}
