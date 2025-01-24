package sec02;

public class Varargs {
    public static void showAll(String...vargs) {        // 매개변수의 가변 인자 선언
        System.out.println("LEN: " + vargs.length);     // vargs를 배열의 참조변수로 간주하고 코드 작성

        for (String s : vargs) {
            System.out.print(s + '\t' );
        }
        System.out.println();
    }

    public static void main(String[] args) {
        showAll("Box");
        showAll("Box", "Toy");
        showAll("Box", "Toy", "Apple");
    }
}
