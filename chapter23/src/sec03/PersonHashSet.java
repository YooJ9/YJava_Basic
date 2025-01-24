package sec03;

import java.util.HashSet;
import java.util.Objects;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "(" + age + "세)";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);     // java.util.Objects의 hash 메소드 (전달 인자 기반
        // 해시 값 반환)
    }

    @Override
    public boolean equals(Object obj) {
        Person comp = (Person)obj;

        if (comp.name.equals(name) && (comp.age == age))
            return true;
        else
            return false;
    }
}

public class PersonHashSet {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person("홍길동", 25));
        set.add(new Person("가나다", 21));
        set.add(new Person("심순이", 15));
        set.add(new Person("홍길동", 25));
        set.add(new Person("홍길동", 27));
        System.out.println("인스턴스 수: " + set.size());

        for(Person person : set) {
            System.out.print(person.toString() + '\t');
        }
        /*System.out.println(set);*/
    }
}
