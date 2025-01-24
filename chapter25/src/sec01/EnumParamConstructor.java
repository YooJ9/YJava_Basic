package sec01;

enum Person7 {
    MAN(29), WOMAN(25);

    int age;
    private Person7(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "I am " + age + " years old";
    }
}

class EnumParamConstructor {
    public static void main(String[] args) {
        System.out.println(Person7.MAN);
        System.out.println(Person7.WOMAN);
    }
}
