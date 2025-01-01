package sec03;

class Cake {

}

class CheeseCake extends Cake {

}
class StrawberryCheeseCake extends CheeseCake {

}

class YummyCakeOf {
    public static void main(String[] args) {
        Cake cake = new StrawberryCheeseCake();

        if(cake instanceof Cake) {
            System.out.println("케잌 인스턴스 or");
            System.out.println("케잌 상속하는 인스턴스 \n");
        }
        if(cake instanceof CheeseCake) {
            System.out.println("치즈케잌 인스턴스 or");
            System.out.println("치즈케잌 상속하는 인스턴스 \n");
        }
        if(cake instanceof StrawberryCheeseCake) {
            System.out.println("딸기치즈케잌 인스턴스 or");
            System.out.println("딸기치즈케잌 상속하는 인스턴스 \n");
        }
    }
}
