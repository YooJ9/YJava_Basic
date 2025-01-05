package sec02;

interface Printable {                           // MS사가 제공하는 인터페이스
    void print(String doc);                     // 흑백 출력을 위한 추상 메소드
}

interface ColorPrintable extends Printable {
    void printCMYK(String doc);                 // 상속받아 두가지 추상 메소드 존재
}


class Prn204Drv implements Printable {          // S사의 흑백 프린터 드라이버
    @Override
    public void print(String doc) {
        System.out.println("From MD-204 printer");
        System.out.println(doc);
    }
}


class Prn909Drv implements ColorPrintable {     // S사의 컬러 프린터 드라이버
    @Override
    public void print(String doc) {
        System.out.println("From MD-909 black & white ver");
        System.out.println(doc);
    }

    @Override
    public void printCMYK(String doc) {
        System.out.println("From MD-909 printer");
        System.out.println(doc);
    }
}

class Prn731Drv implements Printable {          // L사의 흑백 프린터 드라이버
    @Override
    public void print(String doc) {
        System.out.println("From MD-731 printer");
        System.out.println(doc);
    }
}

class PrinterDriver2 {
    public static void main(String[] args) {
        String myDoc = "This is a report about....";

        Printable prn = new Prn204Drv();
        prn.print(myDoc);
        System.out.println();

        prn = new Prn731Drv();
        prn.print(myDoc);
        System.out.println();

        ColorPrintable prn2 = new Prn909Drv();
        prn2.print(myDoc);
        System.out.println();
        prn2.printCMYK(myDoc);
    }
}


