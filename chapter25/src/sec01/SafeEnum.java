package sec01;

enum Animal2 {
    DOG, CAT
}

enum Person3 {
    MAN, WOMAN
}

class SafeEnum {
    public static void main(String[] args) {
        who2(Person3.MAN);       // 정상적인 메소드 호출
        // who(sec01.Animal2.DOG);   // 비정상적 메소드 호출 (자료형 불일치로 오류 발생)
    }

    public static void who2(Person3 man) {
        switch (man) {
            case MAN:
                System.out.println("남성 손님입니다.");
                break;
            case WOMAN:
                System.out.println("여성 손님입니다.");
                break;
        }
    }
}
