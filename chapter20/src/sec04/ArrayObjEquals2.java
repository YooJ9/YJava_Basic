package sec04;

import java.util.Arrays;

class INum2 {
    private int num2;

    public INum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.num2 == ((INum2) obj).num2) {     //  두 인스턴스의 내용 비교
            return true;
        } else {
            return false;
        }
    }
}

public class ArrayObjEquals2 {
    public static void main(String[] args) {
        INum2[] ar1 = new INum2[3];
        INum2[] ar2 = new INum2[3];
        ar1[0] = new INum2(1); ar2[0] = new INum2(1);
        ar1[1] = new INum2(2); ar2[1] = new INum2(2);
        ar1[2] = new INum2(3); ar2[2] = new INum2(3);
        System.out.println(Arrays.equals(ar1, ar2));        // false 반환
    }
}
