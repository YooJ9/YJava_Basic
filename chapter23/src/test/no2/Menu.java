package test.no2;

import java.util.Scanner;

public class Menu {
    private LottoService service;
    private Scanner scanner;

    public Menu(LottoService service) {
        this.service = service;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
      while (true) {
          int select = printMenu(scanner);
          int count = 0;

          if (select == 1) {
              System.out.println();
              System.out.println("===============================================");
              System.out.println("             로또 구입을 시작합니다.           ");
              System.out.println("        (1000원에 로또 번호 하나입니다.)       ");
              System.out.println("===============================================");
              System.out.print("금액 입력: ");

              service.purchaseLotto(scanner, count);
          }
          else if (select == 2) {
              System.out.println("감사합니다. 안녕히 가세요.");
              break;
          }
          else {
              System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요." + "\n");
          }
      }
    }

    private int printMenu(Scanner scanner) {
        System.out.println("===============================================");
        System.out.println("                 Lotto 프로그램                ");
        System.out.println("-----------------------------------------------");
        System.out.println("                 1. Lotto 구입                 ");
        System.out.println("                 2. 프로그램 종료              ");
        System.out.println("===============================================");
        System.out.print("메뉴선택 :");

        int select = scanner.nextInt();
        return select;
    }
}