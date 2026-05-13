package Collections_Framework.List.ArrayLists;

import java.util.ArrayList;

public class remove_Method {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(1);//will remove 2
        list.remove(Integer.valueOf(1));  //will remove 1 beacuse we passed an Object
        System.out.println(list);

    }
}
