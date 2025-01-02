import java.util.Scanner;
import java.util.Random;

class LottoMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 랜덤 클래스 생성
        Random r = new Random();
        int money = 0;

        while (true) {
            int select = showMenu(s);
            int count = 0;
            
            // 로또 구매 금액 입력 및 로또 번호 뽑기
            if (select == 1) {
                count = purchaseLotto(s, count);
                rottoNum(r, count);
                break;
            }

            // 프로그램 종료
            if (select == 2) {
                System.out.println("감사합니다.");
                break;
            }
        }
    }

    static int showMenu(Scanner s) {
        // 시작메뉴
        System.out.println("=========================");
        System.out.println("      Lotto 프로그램");
        System.out.println("-------------------------");
        System.out.println("      1. Lotto 구입");
        System.out.println("      2. 프로그램 종료");
        System.out.println("=========================");
        System.out.print("메뉴선택 : ");

        int menu = s.nextInt();
        return menu;
    }

    static int purchaseLotto(Scanner s, int count) {
        System.out.println("로또 구입 시작");
        System.out.println();
        System.out.println("(1000원에 로또번호 하나입니다.)");
        System.out.print("금액 입력: ");

        int money = s.nextInt();
        count = money / 1000;

        change(money);
        return count;
    }
    
    static void rottoNum(Random r, int count) {
        System.out.println("행운의 로또번호는 아래와 같습니다.");

        int[] number = new int[6];
        int[] ar = new int[45];

        // 로또 번호 출력
        for(int i = 0; i < count; i++) {
            System.out.printf("로또번호%d: ", i + 1);

            // int형 배열 ar에 1~45 값 반복문 통해 입력
            for(int h = 0; h < ar.length; h++) {
                ar[h] = h + 1;
            }

            for (int j = 0; j < number.length; j++) {
                //랜덤 메소드 nextInt(n) 호출(n미만의 정수값까지) > 인덱스 번호에 들어감
                int rand = r.nextInt(45 - j);
                number[j] = ar[rand];       //  0 ~ 44 까지 나올 수 있고, 인덱스 번호는 44까지임
                ar[rand] = ar[44 - j];
                
                if (j < 5) {
                    System.out.print(number[j] + ", ");
                }
                else if(j >= 5) {
                    System.out.println(number[j]);
                }
            }
        }
    }
    
    static void change(int money) {
        System.out.println();
        // 잔돈
        int change = money % 1000;

        System.out.printf("받은 금액은 %d원이고 거스름돈은 %d원입니다.", money, change);
    }
}