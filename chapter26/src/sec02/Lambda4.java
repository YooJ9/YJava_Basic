package sec02;

interface Printable4 {
    void print(String s);
}

class Lambda4 {
    public static void showString(Printable4 p, String s) {
        p.print(s);
    }

    public static void main(String[] args) {
       showString((s) -> { System.out.println(s); }, "What is Lambda?");
    }
}