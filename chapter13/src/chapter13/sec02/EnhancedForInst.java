package chapter13.sec02;

class Box {
    private String contents;
    private int boxNum;

    Box(int num, String cont) {
        boxNum = num;
        contents = cont;
    }
    public int getBoxNum() {
        return boxNum;
    }
    public String toString() {
        return contents;
    }
}

public class EnhancedForInst {
    public static void main(String[] args) {
        Box[] ar = new Box[5];
        ar[0] = new Box(101, "Coffee");
        ar[1] = new Box(202, "Computer");
        ar[2] = new Box(303, "Apple");
        ar[3] = new Box(404, "Dress");
        ar[4] = new Box(505, "Fairy-tale book");

        //배열에서 번호가 505인 Box를 찾아 그 내용문을 출력하는 반복문
        for (Box e : ar) {
            // 박스형 타입의 참조 변수 e에 ar 값 하나씩 대입
            if (e.getBoxNum() == 505) {
                System.out.println(e);
            }
        }
    }
}
