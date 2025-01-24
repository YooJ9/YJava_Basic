package sec01;

enum Person5 {
    MAN, WOMAN;


    @Override
    public String toString() {
        return "I am a dog person";
    }
}

class EnumConst {
    public static void main(String[] args) {
        System.out.println(Person5.MAN);        // toString 메소드의 반환 값 출력
        System.out.println(Person5.WOMAN);      // toString 메소드의 반환 값 출력
    }
}
