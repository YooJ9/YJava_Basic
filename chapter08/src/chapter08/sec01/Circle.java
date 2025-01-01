package chapter08.sec01;

public class Circle {   // 원의 둘레 관련 클래스 정의
    double rad;
    final double PI;

    public Circle(double r) {
        rad = r;
        PI = 3.14;
    }
    public double getPerimeter() {
        return (rad * 2) * PI;
    }
}

// 패키지 선언에 따라 동일 이름의 클래스를 나눌 수 있음.
// 경로가 달라지고, 그에 따라 인스턴스 생성도 달라짐.