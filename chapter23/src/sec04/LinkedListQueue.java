package sec04;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();     // LinkedList<E> 인스턴스 생성
        que.offer("Box");   // 넣기(offer)
        que.offer("Toy");   // 공간 x false 반환
        que.offer("Robot");

        // 무엇이 다음에 나올지 확인
        System.out.println("next: " + que.peek());

        // 첫 번째, 두 번째 인스턴스 꺼내기
        System.out.println(que.poll());             // 대상 x null 반환
        System.out.println(que.poll());

        // 무엇이 다음에 나올지 확인
        System.out.println("next: " + que.peek());

        // 마지막 인스턴스 꺼내기(poll)
        System.out.println(que.poll());

        System.out.println("next: " + que.peek());
        System.out.println("[" + que.poll() + "]"); // 대상 X null 반환
    }
}
