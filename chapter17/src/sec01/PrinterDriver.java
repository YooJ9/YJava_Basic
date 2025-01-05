package sec01;

interface Printable2 {                   // MS가 정의하고 제공한 인터페이스
    public void print(String doc);
}

class SprinterDriver implements Printable2 {
    @Override
    public void print(String doc) {
        System.out.println("From Samsung printer");
        System.out.println(doc);
    }
}

class LPrinterDriver implements Printable2 {
    @Override
    public void print(String doc) {
        System.out.println("From LG printer");
        System.out.println(doc);
    }
}

public class PrinterDriver {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";

        //삼성 프린터로 출력
        Printable2 prn2 = new SprinterDriver();
        prn2.print(myDoc);
        System.out.println();

        //LG 프린터로 출력
        prn2 = new LPrinterDriver();
        prn2.print(myDoc);
    }
}