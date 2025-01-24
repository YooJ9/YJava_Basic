package sec04;

import java.util.ArrayDeque;
import java.util.Deque;

interface DIStack<E> {              // Stack 클래스를 생성하여 Deq을 Stack 처럼 사용
    public boolean push(E item);
    public E pop();
}

class DCStack<E> implements DIStack<E> {
    private Deque<E> deq;

    public DCStack(Deque<E> d) {
        deq = d;
    }

    public boolean push(E item){
        return deq.offerFirst(item);
    }

    public E pop() {
        return deq.pollFirst();
    }
}

class DefinedStack {
    public static void main(String[] args) {
        DIStack<String> stk = new DCStack<>(new ArrayDeque<String>());

        // PUSH 연산
        stk.push("1. Box");
        stk.push("2. Toy");
        stk.push("3. Robot");

        // POP 연산
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());  // 없으면, null 값 반환
    }
}
