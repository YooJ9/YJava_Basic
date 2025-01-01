package chapter10.sec01;

class InstCnt1 {
    static int instNum = 100;

    InstCnt1() {
        instNum++;
        System.out.println("인스턴스 생성 : " + instNum);
    }
}

class OnlyClassNoInstance {
    public static void main(String[] args) {
        InstCnt1.instNum -= 15;          // 인스턴스 생성 없이 instNum에 접근
        System.out.println(InstCnt1.instNum);
    }
}
