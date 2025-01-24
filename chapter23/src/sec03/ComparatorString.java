package sec03;

import java.util.Comparator;
import java.util.TreeSet;

class StringComparator implements Comparator<String> {      // String 클래스 정렬 기준 : 사전 편찬순
    public int compare(String s1, String s2) {             // 이름 길이 순으로 바꾸는 문장
        return s1.length() - s2.length();
    }
}

class ComparatorString {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>(new StringComparator());
        tree.add("BOX");
        tree.add("Rabbit");
        tree.add("Robot");

        for(String s : tree) {
            System.out.print(s.toString() + '\t');
        }
        System.out.println();
    }
}
