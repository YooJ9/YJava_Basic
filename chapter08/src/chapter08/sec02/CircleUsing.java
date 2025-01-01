package chapter08.sec02;

public class CircleUsing {
    public static void main(String[] args) {
       chapter08.sec02.Circle c1 = new chapter08.sec02.Circle(3.5);
        System.out.println("반지름 3.5 원 넓이:" + c1.getArea());

       chapter08. sec01.Circle c2 = new chapter08.sec01.Circle(3.5);
        System.out.println("반지름 3.5 원 둘레:" + c2.getPerimeter());
    }
}
