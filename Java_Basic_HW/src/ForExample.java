public class ForExample {
    public static void main(String[] args) {

        //1. 삼각형
        for(int i=1; i<=5; i++) { // 1번 반복문
            for(int j = 1; j<= 5 - i; j++) {
                System.out.print(" "); // 1-1 반복문
            }

            for(int j = 0; j < (i * 2) - 1; j++) {
                System.out.print("*"); // 1-2 반복문
            }
            System.out.println();
        }

        //2. 사각형
        for(int i=1; i<=3; i++) {
            for(int j=1; j<=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}