package chapter12.sec02;

import java.util.Arrays;
import java.util.Scanner;

public class ReadString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String str1 = sc.nextLine();

        System.out.print("문자열 입력: ");
        String str2 = sc.nextLine();

        System.out.printf("입려된 문자열 1: %s \n", str1);
        System.out.printf("입려된 문자열 2: %s \n", str2);
    }
}