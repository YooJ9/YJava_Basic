package sec02;

interface Printable {
    void print(String s);
}

class Printer implements Printable {

    @Override
    public void print(String s) {
        System.out.println(s);
    }
}

class Lambda1 {
    public static void main(String[] args) {
        Printable prn = new Printer();
        prn.print("What is Lambda?");
    }
}
