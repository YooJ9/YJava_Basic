package practice;

import java.util.Arrays;

class Person3 implements Comparable {
    private String name;
    private int age;

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Object o) {
        Person3 p = (Person3) o;
        if(this.name.length() > p.name.length()) {
            return 1;                   //  인자로 전달된 o가 작다면 양의 정수 반환
        }
        else if(this.name.length() < p.name.length()) {
            return -1;                  // 인자로 전달된 o가 크다면 음의 정수 반환
        }
        else {
            return 0;                   // 인자로 전달된 o와 같다면 0을 반환
        }


        /*
        public int compareTo(Object o) {
           Person p = (Person)o;
           return this.age - p.age;
        */
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}

public class ArrayObjSortLength {
    public static void main(String[] args) {
        Person3[] ar = new Person3[3];
        ar[0] = new Person3("Leeo", 29);
        ar[1] = new Person3("Goo", 15);
        ar[2] = new Person3("Sookj", 37);

        Arrays.sort(ar);
        for(Person3 p : ar) {
            System.out.println(p);
        }

    }
}