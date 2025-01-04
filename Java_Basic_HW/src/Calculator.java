//문제) do while문을 이용하여 사칙연산(+,-,*,/)이 가능한 계산기를 만들어 보시오.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int select = 0;

        do {
            System.out.println();

            select = showMenu(s);

            if (select == 1) {
                System.out.println("더하기 연산을 위한 두 수를 입력하세요.");
                System.out.print("입력 >> ");
                plus(s);
            }
            else if (select == 2) {
                System.out.println("빼기 연산을 위한 두 수를 입력하세요.");
                System.out.print("입력 >> ");
                minus(s);
            }
            else if (select == 3) {
                System.out.println("곱하기 연산을 위한 두 수를 입력하세요.");
                System.out.print("입력 >> ");
                mul(s);
            }
            else if (select == 4) {
                System.out.println("나누기 연산을 위한 두 수를 입력하세요.");
                System.out.print("입력 >> ");
                divide(s);
            }
            else if (select == 0) System.out.println("프로그램을 종료합니다..");
        } while(select > 0);
    }

    static int showMenu(Scanner s) {
        System.out.println("======================");
        System.out.println("   계산기 프로그램");
        System.out.println("====================== \n");
        System.out.println("  메뉴를 선택하세요.");
        System.out.println("  1.  더하기 연산");
        System.out.println("  2.  빼  기 연산");
        System.out.println("  3.  곱하기 연산");
        System.out.println("  4.  나누기 연산");
        System.out.println("  0. 프로그램 종료");
        System.out.print("번호입력 >> ");

        int menu = s.nextInt();
        return menu;
    }

    static int plus(Scanner s) {
        int x = s.nextInt();
        int y = s.nextInt();
        int plus = x + y;

        System.out.println("== 연산결과 출력==");
        System.out.printf("%d + %d = %d\n", x, y, plus);
        return plus;
    }

    static int minus(Scanner s) {
        int x = s.nextInt();
        int y = s.nextInt();
        int minus = x - y;

        System.out.println("== 연산결과 출력==");
        System.out.printf("%d + %d = %d\n", x, y, minus);
        return minus;
    }

    static int mul(Scanner s) {
        int x = s.nextInt();
        int y = s.nextInt();
        int mul = x * y;

        System.out.println("== 연산결과 출력==");
        System.out.printf("%d + %d = %d\n", x, y, mul);
        return mul;
    }

    static int divide(Scanner s) {
        int x = s.nextInt();
        int y = s.nextInt();
        int divide = x / y;

        System.out.println("== 연산결과 출력==");
        System.out.printf("%d + %d = %d\n", x, y, divide);
        return divide;
    }
}