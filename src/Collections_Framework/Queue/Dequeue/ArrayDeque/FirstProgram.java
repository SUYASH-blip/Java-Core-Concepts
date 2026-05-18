package Collections_Framework.Queue.Dequeue.ArrayDeque;
import java.util.ArrayDeque;
public class FirstProgram {
    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(32);
        arrayDeque.offer(95);
        arrayDeque.offer(95);
        arrayDeque.offer(95);
        arrayDeque.offer(95);
        arrayDeque.offer(95);
        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque);

    }
}
