package sec03;

import java.util.Comparator;
import java.util.TreeSet;

class Person3 implements Comparable<Person3> {
    String name;
    int age;

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person3 p) {       // 기존 정렬 기준을 바꿀 때 Comparator를 사용함. (기존은 무시됨.)
        return this.age - p.age;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }
}

class PersonComparator implements Comparator<Person3> {

    /*
    Comparator 구현 (TreeSet 정렬 기준이 되는 메소드)
    p1 > p2 : 양의 정수 반환
    p1 < p2 : 음의 정수 반환
    p1 = p2 : 0 반환
     */

    public int compare(Person3 p1, Person3 p2){
        return p2.age - p1.age;
    }
}

public class ComparatorPerson {
    public static void main(String[] args) {
        TreeSet<Person3> tree = new TreeSet<>(new PersonComparator());
        tree.add(new Person3("YOON", 37));
        tree.add(new Person3("HONG", 53));
        tree.add(new Person3("PARK", 22));

        for(Person3 p : tree) {
            System.out.println(p);
        }
    }
}
