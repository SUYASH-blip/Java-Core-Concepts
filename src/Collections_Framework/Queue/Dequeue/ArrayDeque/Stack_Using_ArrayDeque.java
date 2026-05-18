package Collections_Framework.Queue.Dequeue.ArrayDeque;

import java.util.ArrayDeque;

public class Stack_Using_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.offerLast("O");
        stack.offerLast("M");
        stack.offerLast("K");
        stack.offerLast("A");
        stack.offerLast("R");
        System.out.println(stack);
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack);

    }
}
