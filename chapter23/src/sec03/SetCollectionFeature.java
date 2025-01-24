package sec03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollectionFeature {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Toy");
        set.add("Box");
        set.add("Robot");
        set.add("Box");
        // 중복 x -> 동일 인스턴스 기준?
        // 1. equals 반환값이 같은 경우
        // 2. Hash 값이 같은 경우

        System.out.println("인수턴스 수: " + set.size());

        // 반복자를 이용한 전체 출력
        for(Iterator<String> itr = set.iterator(); itr.hasNext();) {
            System.out.print(itr.next() + '\t');
        }
        System.out.println();

        // for-each문을 이용한 전체 출력
        for(String s : set) {
            System.out.print(s + '\t');
        }
        System.out.println();
    }
}
