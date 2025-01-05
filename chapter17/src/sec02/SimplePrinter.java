package sec02;

interface Printable5 {
    static void printLine(String str) {
        System.out.println(str);
    }
    default void print5(String doc) {
        printLine(doc);                     // 인터페이스의 static 메소드 호출
    }
}

// 인터페이스 Printable5에는 구현해야 할 메소드가 존재하지 않는다.
class Printer implements Printable5 {}

public class SimplePrinter {
    public static void main(String[] args) {
        String myDoc = "This is a report about....";
        Printable5 prn = new Printer();
        prn.print5(myDoc);

        // 인터페이스의 static 메소드 직접 호출
        Printable5.printLine("end of line");
    }
}
