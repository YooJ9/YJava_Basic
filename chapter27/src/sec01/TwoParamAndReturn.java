package sec01;

interface Calculate2 {
    int cal(int a, int b); // 값을 반환하는 추상 메소드
}

class TwoParamAndReturn {
    public static void main(String[] args) {
        Calculate2 c;
        c = (a, b) -> { return a + b; };    // return문의 중괄호는 생략 불가
        System.out.println(c.cal(4, 3));

        c = (a, b) -> a + b;    // 연산 결과 남으면, 별도로 명시하지 않아도 반환 대상이 됨
        System.out.println(c.cal(4, 3));
    }
}