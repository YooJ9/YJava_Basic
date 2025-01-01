package chapter13.sec02;

public class EnhancedFor {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};

        //배열 요소 전체 출력
        for(int e : ar) {                   // e의 첫번째 데이터 저장 후 출력
            System.out.print(e + " ");
        }
        System.out.println();   // 단순 줄 바꿈

        int sum = 0;
        //배열 요소의 전체 합 출력
        for(int e : ar) {
            sum += e;
        }
        System.out.println("sum: " + sum);
    }
}
