package sec01;

class Friend2 {
    protected String name;
    protected String phone;

    public Friend2(String na, String ph) {
        name = na;
        phone = ph;
    }
    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("전화: " + phone);
    }
}

class UnivFriend2 extends Friend2 {
    private String major;

    public UnivFriend2(String na, String ma, String ph) {
        super(na, ph);          // 부모 클래스의 생성자 호출
        major = ma;
    }
    public void showInfo() {    // 부모 클래스의 메소드 오버라이딩
        super.showInfo();
        System.out.println("전공: " + major);
    }
}

class CompFriend2 extends Friend2 {
    private String department;

    public CompFriend2(String na, String ph, String de) {
        super(na, ph);          // 부모 클래스의 생성자 호출
        department = de;
    }
    public void showInfo() {   // 부모 클래스의 메소드 오버라이딩
        super.showInfo();
        System.out.println("부서: " + department);
    }
}

class MyFriends2 {
    public static void main(String[] args) {
        Friend2[] frns = new Friend2[10];
        int cnt = 0;

        frns[cnt++] = new UnivFriend2("LEE","Computer","010-333-555");
        frns[cnt++] = new UnivFriend2("SEO","Electronics","010-222-444");
        frns[cnt++] = new CompFriend2("YOON","R&D 1", "02-123-456");
        frns[cnt++] = new CompFriend2("PARK","R&D 2", "02-321-654");

        // 모든 동창 및 동료의 정보 전체 출력
        for(int i = 0; i < cnt; i++) {
            frns[i].showInfo();         // 오버라이딩한 메소드 호출
            System.out.println();
        }
    }
}
