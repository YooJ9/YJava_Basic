package sec02;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();                               // 상위 클래스의 finalize 메소드 호출 (기존거 확인 위해 먼저 호출)
        System.out.println("destroyed: " + name);       // 끼워넣기 오버라이딩..
    }
}

public class ObjectFinalize {
    public static void main(String[] args) {
        Person p1 = new Person("Yoon");
        Person p2 = new Person("Park");
        p1 = null;                                      // 참조대상을 가비지 컬렉션의 대상으로 만듦
        p2 = null;                                      // 참조대상을 가비지 컬렉션의 대상으로 만듦

        // System.gc();                                 => 가비지컬렉션의 수행을 요청 (부탁..)
        // System.runFinalization();                    => 소멸 보류된 인스턴스의 finalize 메소드 호출 요청 (부탁..)

        System.out.println("end of program");
    }
}
