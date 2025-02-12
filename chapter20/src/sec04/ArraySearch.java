package sec04;

import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        int[] ar = {33, 55, 11, 44, 22};
        Arrays.sort(ar);
        for(int n : ar) {
            System.out.println(n + "\t");
        }
        System.out.println();

        int idx = Arrays.binarySearch(ar, 33);  // 배열 ar에서 33을 찾아라.
        System.out.println("Index of 33: " + idx);
    }
}
