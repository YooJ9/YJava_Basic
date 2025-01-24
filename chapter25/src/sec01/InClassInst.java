package sec01;

class Person4 {
    public static final Person4 MAN = new Person4();
    public static final Person4 WOMAN = new Person4();

    @Override
    public String toString() {
        return "I am a dog person";     // "나는 개를 사랑하는 사람입니다."
    }
}

class InClassInst {
    public static void main(String[] args) {
        System.out.println(Person4.MAN);
        System.out.println(Person4.WOMAN);
    }
}
