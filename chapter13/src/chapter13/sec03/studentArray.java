package chapter13.sec03;

import java.util.Scanner;

public class studentArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요: ");
        int num = s.nextInt();
        System.out.print("번 학생의 성적을 입력하세요.");
        System.out.print("국어 점수: ");
        int kor = s.nextInt();
        System.out.println("영어 점수: ");
        int eng = s.nextInt();
        System.out.println("수학 점수: ");
        int mat = s.nextInt();
    }
}
