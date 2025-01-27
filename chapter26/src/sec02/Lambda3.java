package sec02;

interface Printable3 {  // 추상 메소드가 하나인 인터페이스
    void print(String s);
}

class Lambda3 { // 람다식
    public static void main(String[] args) {
        Printable3 prn = (s) -> { System.out.println(s); };
        prn.print("What is Lambda?");
    }
}