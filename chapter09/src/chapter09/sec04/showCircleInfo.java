package chapter09.sec04;

class Point {
    int xPos, yPos;                 // 필드

    public Point(int x, int y) {    // 생성자
        xPos = x;
        yPos = y;
    }
    public void showPointInfo() {
        System.out.println("[" + xPos + ", " + yPos + "]");
    }
}

class Circle {
    Point point;
    int rad;

    public Circle(int x, int y, int r) {
        point = new Point(x, y);
        rad = r;
    }

    public void showCircleInfo() {
        System.out.print("원의 좌표 정보: ");
        point.showPointInfo();
        System.out.println("반지름 정보 : " + rad);
    }

}

public class showCircleInfo {
    public static void main(String[] args) {
        Circle c = new Circle(2,2,4);
        c.showCircleInfo();
    }
}
