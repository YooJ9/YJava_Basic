package sec01;

enum Person6 {
    MAN, WOMAN;

    private Person6() {
        System.out.println("Person constructor called");
    }


    @Override
    public String toString() {
        return "I am a dog person";
    }
}

class EnumConstructor {
    public static void main(String[] args) {
        System.out.println(Person6.MAN);
        System.out.println(Person6.WOMAN);
    }
}
