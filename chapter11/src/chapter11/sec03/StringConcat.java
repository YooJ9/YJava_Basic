package chapter11.sec03;

public class StringConcat {
    public static void main(String[] args) {
        String str1 = "Coffe";
        String str2 = "Bread";

        String str3 = str1.concat(str2);
        System.out.println(str3);

        String str4 = "Fresh".concat(str3);
        System.out.println(str4);
    }
}
