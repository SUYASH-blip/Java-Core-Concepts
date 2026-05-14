package Map.HashMap;

import java.util.HashMap;

public class Basic_Methods {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Suyash");
        map.put(2,"Jaydeep");
        map.put(3,"Swati");
        String i =  map.get(1);
        System.out.println(i);



    }
}
