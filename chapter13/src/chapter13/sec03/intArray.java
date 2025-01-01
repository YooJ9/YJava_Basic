package chapter13.sec03;

public class intArray {
    int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    public void changeArray(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + "\t");
            }
        }

    }
}
