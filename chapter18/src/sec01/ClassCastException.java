package sec01;

class Board { }
class PBoard extends Board { }

public class ClassCastException {
    public static void main(String[] args) {
        Board pbd1 = new PBoard();
        PBoard pbd2 = (PBoard) pbd1;        // 가능

        System.out.println("..intermediate location.. ");
        Board ebd1 = new Board();           // 부모 클래스의 인스턴스를 자식 클래스로 강제 형 변환하려고 함. (불가능)
        PBoard ebd2 = (PBoard) ebd1;        // 예외 발생
    }
}
