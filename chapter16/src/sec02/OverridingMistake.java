package sec02;

class ParentAdder {
    public int add(int a, int b) {
        return a + b;
    }
}

class ChildAdder extends ParentAdder {
    /* 컴파일러에게 부모 클래스의 add 메소드를 오버라이딩 하는 것을 알려주기 위함
       @Override (프로그래머에게 실수를 알려준다. ==> 안전성을 높임.)
       상위클래스의 add 메소드를 오버라이딩 하려고 한다.
       ==> 현재 코드에서는 반환형이 다르기 때문에 오버라이딩 되지 않음. (오버로딩이된 상황)
     */
    public double add(double a, double b) {
        System.out.println(" 덧셈을 진행합니다.");
        return a + b;
    }
}

class OverridingMistake {
    public static void main(String[] args) {
        ParentAdder adder = new ChildAdder();
        // 정수를 전달할 경우, 정수형 add 메소드 호출 / 실수 전달, 실수형 add 메소드 호출
        // 메소드 오버라이딩이 아닌, 메소드 오버로딩이 된 것.
        System.out.println(adder.add(3,4));
    }

}
