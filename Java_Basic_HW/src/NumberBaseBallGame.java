import java.util.Random;
import java.util.Scanner;

public class NumberBaseBallGame {
    public static void main(String[] args) {
        // 스캐너, 랜덤 객체 생성
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int[] comp = new int[3];
        int[] myNumber = new int[3];
        int count = 0;

        // 실행
        System.out.println("==숫자 야구 게임==");
        RandomComNumber(r, comp);
        do {
            ScanMyNumber(s, myNumber);
            MyNumberOut(myNumber);
            count++;
            NumberCompare(count, myNumber, comp);
        } while(true);
    }

    // 메소드 나누기
    // 1. 컴퓨터 숫자 값 만들기(+ 중복 제거)
    static void RandomComNumber(Random r, int[] comp) {
        int[] rand = new int[9];

        // int[] rand 배열에 1 ~ 9까지 값 넣기
        for(int h = 0; h < rand.length; h++) {
            rand[h] = h + 1;
        }
        // 중복 제거
        for(int i = 0; i < comp.length; i++) {
            int randNum =  r.nextInt(9 - i);
            comp[i] = rand[randNum];
            rand[randNum] = rand[8 - i];
        }
    }

    // 2. 나의 숫자 입력, 배열에 저장
    static void ScanMyNumber(Scanner s, int[] myNumber) {
        System.out.print("숫자 입력 => ");
        // 나의 숫자 배열에 저장
        for(int i = 0; i < 3; i++) {
            int myNum = s.nextInt();
            myNumber[i] = myNum;
        }
    }

    // 3. 나의 숫자 출력
    static void MyNumberOut(int[] myNumber) {
        // 나의 숫자 출력
        for (int i = 0; i < 3; i++) System.out.print(myNumber[i] + " ");
        System.out.print(" ==> ");
    }

    // 4. 나의 값과 컴퓨터 값 비교
    static void NumberCompare(int count, int[] myNumber, int[] comp) {
        // 나의 값과 컴퓨터 값 비교
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < 3; i++) {
            if (myNumber[i] == comp[i]) {
                strike += 1;
            }
            for (int j = 0; j < 3; j++) {
                if (myNumber[i] == comp[j] && myNumber[i] != comp[i]) {
                    ball += 1;
                }
            }
        }
        if (strike == 3) {
            System.out.print(strike + "S" + ball + "B" + "\n");
            System.out.println(count + "번째 만에 맞췄군요.");
            System.exit(0);
        }
        else {
            System.out.print(strike + "S" + ball + "B" + "\n");
        }
    }
}
