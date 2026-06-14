package Practice;

import java.util.LinkedList;
import java.util.List;

public class practice2 {
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        list1.add("Hello");
        list1.add("from");
        list1.add("Java");

        Test2.printList(list1);

    }
}
class Test2<T>
{
    public static void printList(List<?> list){
        System.out.println(list);
    }


}
