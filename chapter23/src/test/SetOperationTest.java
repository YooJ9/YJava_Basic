package test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationTest {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {4, 5, 6, 7, 8};

        Set<Integer> set1 = new HashSet<>(List.of(array1));
        Set<Integer> set2 = new HashSet<>(List.of(array2));

        Set<Integer> result1 = new HashSet<>(set1);
        Set<Integer> result2 = new HashSet<>(set1);
        Set<Integer> result3 = new HashSet<>(set1);

        result1.addAll(set2);
        System.out.println("합집합: " + result1);

        result2.retainAll(set2);
        System.out.println("교집합: " + result2);

        result3.removeAll(set2);
        System.out.println("차집합: " + result3);
    }
}
