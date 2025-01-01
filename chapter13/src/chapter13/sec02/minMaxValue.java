package chapter13.sec02;

public class minMaxValue {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int min = minValue(arr);
        int max = maxValue(arr);

        System.out.println(min);
        System.out.println(max);

    }

    public static int minValue(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxValue(int[] arr) {
        int max = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}

