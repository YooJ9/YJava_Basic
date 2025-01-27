package sec01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class SLenCompartorLambda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Robot");
        list.add("Lambda");
        list.add("Box");

        Collections.sort(list, (s1, s2) -> s1.length() - s2.length()); // 정렬

        for (String s : list) {
            System.out.println(s);
        }
    }
}
