package chapter10.sec02;

class NumberPrinter {
    private int myNum = 0;

    static void showInt(int n) {
        System.out.println(n);
    }           // 클래스 메소드(static 메소드)

    static void showDouble(double n) {
        System.out.println(n);
    }     // 클래스 메소드

    void setMyNumber(int n) {
        myNum = n;
    }                          // 인스턴스 메소드

    void showMyNumber() {
        showInt(myNum);
    }                         // 인스턴스메소드 -> 클래스 내부에서 클래스 메소드 호출

}

public class ClassMethod {
    public static void main(String[] args) {
        NumberPrinter.showInt(20);


        NumberPrinter np = new NumberPrinter();
        np.showDouble(3.15);    //별로 좋지 않음.(인스턴스와 혼동)
        np.setMyNumber(75);
        np.showMyNumber();
    }
}

