package chapter13.sec03;

public class TwoDimenArray2 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        int num = 1;

        //배열에 값 입력
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num;
                num++;
            }
        }

        //배열에 값 출력
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
