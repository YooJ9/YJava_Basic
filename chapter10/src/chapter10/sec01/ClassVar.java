package chapter10.sec01;

class InstCnt {
    static int instNum = 0;     // 클래스 변수(static 변수)

    InstCnt() {                 // 생성자
        instNum++;
        System.out.println("인스턴스 생성 : " + instNum);
    }
}

class ClassVar {
    public static void main(String[] args) {
        InstCnt1 cnt1 = new InstCnt1();
        InstCnt1 cnt2 = new InstCnt1();
        InstCnt1 cnt3 = new InstCnt1();
    }
}
