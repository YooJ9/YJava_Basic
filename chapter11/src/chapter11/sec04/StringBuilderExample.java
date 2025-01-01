package chapter11.sec04;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stb = new StringBuilder("990925-1012999");
        stb.replace(6,7, " ");
        System.out.println(stb.toString());
    }
}
