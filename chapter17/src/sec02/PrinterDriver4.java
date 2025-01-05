package sec02;

interface Printable4 {
   public void print(String doc);
   default void printCMYK(String doc) {}       // 인터페이스의 디폴트 메소드
}

class Prn731Drv4 implements Printable4 {
    @Override
    public void print(String doc) {
        System.out.println("From MD-731 printer");
        System.out.println(doc);
    }
}

class Prn990Drv4 implements Printable4 {
    @Override
    public void print(String doc) {
        System.out.println("From MD-990 black & white ver");
        System.out.println(doc);
    }

    @Override
    public void printCMYK(String doc) {
        System.out.println("From Md-990 CMYK ver");
        System.out.println(doc);
    }
}

class PrinterDriver4 {
    public static void main(String[] args) {
        String myDoc4 = "This is a report about....";
        Printable4 prn1 = new Prn731Drv4();
        prn1.print(myDoc4);
        System.out.println();

        Printable4 prn2 = new Prn990Drv4();
        prn2.print(myDoc4);
    }
}
