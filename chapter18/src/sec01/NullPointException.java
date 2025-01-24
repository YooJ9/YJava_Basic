package sec01;

public class NullPointException {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str);    // null 출력은 해 줌.
        int len = str.length();     // 예외 발생 (값이 null이고, 인스턴스가 없어서)
    }
}
