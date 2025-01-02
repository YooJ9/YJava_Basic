package sec01;

class UnivFriend {                                  // 대학 동창
    private String name;
    private String major;
    private String phone;

    public UnivFriend(String na, String ma, String ph) {
        name = na;
        major = ma;
        phone = ph;
    }
    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("전공: " + major);       // 전공
        System.out.println("전화: " + phone);
    }
}

class CompFriend {                                // 직장 동료
    private String name;
    private String department;                    // 부서
    private String phone;

    public CompFriend(String na, String de, String ph) {
        name = na;
        department = de;
        phone = ph;
    }
    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("부서: " + department);
        System.out.println("전화: " + phone);
    }
}

class MyFriends {
    public static void main(String[] args) {
        // 대학 동창의 관리를 위한 배열과 변수(저장소)
        UnivFriend[] ufrns = new UnivFriend[5];
        int ucnt = 0;                             // 인덱스 값

        // 직장 동료의 관리를 위한 배열과 변수(저장소)
        CompFriend[] cfrns = new CompFriend[5];
        int ccnt = 0;                             // 인덱스 값

        // 대학 동창의 정보 저장
        ufrns[ucnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
        ufrns[ucnt++] = new UnivFriend("SEO", "Electronics", "010-222-444");

        // 직장 동료의 정보 저장
        cfrns[ccnt++] = new CompFriend("YOON", "R&D 1", "02-123-999");
        cfrns[ccnt++] = new CompFriend("PARK", "R&D 2", "02-321-777");

        // 모든 동창 및 동료의 정보 전체 출력
        for(int i = 0; i < ucnt; i++) {
            ufrns[i].showInfo();
            cfrns[i].showInfo();
        }

    }
}
