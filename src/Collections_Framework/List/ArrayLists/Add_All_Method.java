package Collections_Framework.List.ArrayLists;
import java.util.*;
public class Add_All_Method {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        //l1.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l1.addAll(l2);
        System.out.println(l1);
        // proxy
        System.out.println(l2);


    }
}
