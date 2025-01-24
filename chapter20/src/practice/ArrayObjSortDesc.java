package practice;

import java.util.Arrays;

class Person2 implements Comparable {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Object o) {
        Person2 p = (Person2) o;
        if(this.age < p.age) {
            return 1;                   //  인자로 전달된 o가 작다면 양의 정수 반환
        }
        else if(this.age > p.age) {
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

public class ArrayObjSortDesc {
    public static void main(String[] args) {
        Person2[] ar = new Person2[3];
        ar[0] = new Person2("Lee", 29);
        ar[1] = new Person2("Goo", 15);
        ar[2] = new Person2("Soo", 37);

        Arrays.sort(ar);
        for(Person2 p : ar) {
            System.out.println(p);
        }

    }
}
