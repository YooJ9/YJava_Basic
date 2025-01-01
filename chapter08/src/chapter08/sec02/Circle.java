package chapter08.sec02;

public class Circle {   // 원의 넓이 관련 클래스 정의
    double rad;
    final double PI;

    public Circle(double r) {
        rad = r;
        PI = 3.14;
    }
    public double getArea() {
        return (rad * rad) * PI;
    }
}
