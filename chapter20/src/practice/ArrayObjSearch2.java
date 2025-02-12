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
        Person p = (Person)o;
        return this.name.compareTo(p.name);
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}


class ArrayObjSearch {
    public static void main(String[] args) {
        Person[] ar = new Person[3];

        ar[0] = new Person("Lee", 29);
        ar[1] = new Person("Goo", 15);
        ar[2] = new Person("Soo", 37);

        Arrays.sort(ar);

        //배열에서 특정 값을 이진 검색(Binary Search)하여 해당 값의 인덱스를 반환, 검색 전 정렬 필수
        int idx = Arrays.binarySearch(ar, new Person("Goo", 15));
        System.out.println(ar[idx]);
    }
}