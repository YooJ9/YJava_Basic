package sec04;

import java.util.Arrays;

class Person implements Comparable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return this.age - p.age;                            // 나이가 같으면 0을 반환
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }


}

public class ArrayObjSearch {
    public static void main(String[] args) {
        Person[] ar = new Person[3];
        ar[0] = new Person("Lee", 29);
        ar[1] = new Person("Goo", 15);
        ar[2] = new Person("Soo", 37);
        Arrays.sort(ar);                                    // 탐색에 앞서 정렬을 진행

        int idx = Arrays.binarySearch(ar, new Person("Who are you?", 37));
        System.out.println(ar[idx]);
    }
}
