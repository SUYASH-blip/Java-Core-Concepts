package Collections_Framework.List.Linked_Lists;

import java.util.Arrays;
import java.util.LinkedList;

public class Basic_Methods {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);
        list.get(0);
        Object s = list.getFirst();
        System.out.println(s);
        Object o = list.getLast();
    //    System.out.println(o);

        System.out.println(list);

    }
}
