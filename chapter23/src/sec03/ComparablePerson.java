package sec03;

import java.util.TreeSet;

class Person2 implements Comparable<Person2> {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }

    @Override
    public int compareTo(Person2 p) {
        return this.age - p.age;
    }
}

public class ComparablePerson {
    public static void main(String[] args) {
        TreeSet<Person2> tree = new TreeSet<>();
        tree.add(new Person2("YOON", 37));
        tree.add(new Person2("HONG", 53));
        tree.add(new Person2("PARK", 22));

        for(Person2 p : tree) {
            System.out.println(p);
        }
    }
}
