package chapter10.sec04;

import java.time.LocalDate;

public class DateOfExecution {
    static String date;

    static {                                // 클래스 로딩 시 단 한 번 실행되는 영역
        LocalDate nDate = LocalDate.now();
        date = nDate.toString();
    }

    public static void main(String[] args) {
        System.out.println(date);
    }
}
