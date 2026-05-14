package Map.HashMap;

import java.util.HashMap;
import java.util.Set;

public class Key_Set_Method {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Suyash");
        map.put(2,"Jaydeep");
        map.put(3,"Swati");

        //Indirect Method by Storing in a Set
        Set<Integer> set = map.keySet();
        for(Integer i :set){
            System.out.println(map.get(i));
        }

        //Direct Method Without storing in a set
        for(Integer i :map.keySet()){
            System.out.println(map.get(i));
        }

        //Removing In Keyset Removes from real Map
        map.keySet().remove(3);
        System.out.println(map);

    }
}
