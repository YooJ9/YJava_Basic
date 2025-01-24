package sec03;

import java.util.Comparator;
import java.util.TreeSet;

class IntegerComparator implements Comparator<Integer> {
    public int compare(Integer tr1, Integer tr2) {
        /* return tr2.intValue() - tr1.intValue();   // 언박싱 과정(생략 가능) */
        return tr2 - tr1;
    }
}

public class TreeSetInteger {
    public static void main(String[] args) {
        TreeSet<Integer> tr = new TreeSet<>(new IntegerComparator());
        tr.add(30);
        tr.add(10);
        tr.add(20);
        System.out.println(tr);

    }
}