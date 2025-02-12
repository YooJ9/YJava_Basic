package sec03;

import java.util.HashSet;

class Num {
    private int num;
    public Num(int n) {
        num = n;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}

public class HashSetEqualityOne {
    public static void main(String[] args) {
        HashSet<Num> set = new HashSet<>();
        set.add(new Num(7799));
        set.add(new Num(9955));
        set.add(new Num(7799));     // 중복 o
        System.out.println("인스턴스 수: " + set.size());

        for(Num n : set) {
            System.out.print(n.toString() + '\t');
        }
        System.out.println();
    }
}
