package test.no2;

import java.util.Scanner;

public class LottoService {
    Lotto lotto = new Lotto();

    public void purchaseLotto(Scanner scanner, int count) {
        int money = scanner.nextInt();
        count = money / 1000;

        if(money < 1000) {
            System.out.println("금액이 적습니다. 다시 입력해 주세요.");
            System.out.println();
        }
        else {
            System.out.println();
            System.out.println("===============================================");
            System.out.println("                행운의 로또번호                ");
            System.out.println("===============================================");

            for (int i = 0; i < count; i++) {
                System.out.printf("     로또번호 %d: ", i + 1);
                System.out.println(lotto.getNumbers());
            }
            change(money);
        }
    }

    private void change(int money) {
        int change = money % 1000;

        System.out.println("-----------------------------------------------");
        System.out.printf("      받은 금액 : %d원, 거스름돈 : %d원%n", money, change);
        System.out.println("      감사합니다. 다음에 또 이용해 주세요.");
        System.out.println("===============================================");
    }
}