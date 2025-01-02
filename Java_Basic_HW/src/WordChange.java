
import java.util.Scanner;
import java.util.Random;

public class WordChange {
    public static void main(String[] args) {
        final int SIZE_OF_ARRAY = 10;
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        String[] word = new String[SIZE_OF_ARRAY];

        for(int i = 0; i < SIZE_OF_ARRAY; i++) {
            System.out.print("단어 입력 : ");
            word[i] = sc.nextLine();
        }

        for(int i = 0; i < SIZE_OF_ARRAY; i++) {
            int k = rd.nextInt(10);
            System.out.print(word[k]);
        }
    }
}
