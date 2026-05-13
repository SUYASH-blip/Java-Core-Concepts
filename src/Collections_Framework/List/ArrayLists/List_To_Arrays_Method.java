package Collections_Framework.List.ArrayLists;
import java.util.*;
public class List_To_Arrays_Method {
    public static void main(String[] args) {
        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        Object[] arr = l2.toArray();
        Integer[] arr2 = l2.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
