package sec01;

import java.util.Scanner;

public class ExceptionCase3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("a/b...a?");
        int n1 = kb.nextInt();                  // 입력 오류 발생 가능(문자열 같은)
        System.out.print("a/b...b?");
        int n2 = kb.nextInt();                  // 입력 오류 발생 가능
        System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2);
        System.out.println("Good bye~~~!");
    }
}