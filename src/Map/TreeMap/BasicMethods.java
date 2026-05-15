package Map.TreeMap;
import java.util.TreeMap;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.Set;
import java.util.Map;


public class BasicMethods {
    public static void main(String[] args) {
        SortedMap<Integer,String> map = new TreeMap<>();
                map.put(1,"Maggie");
                map.put(2,"Tomato Sauce");
                map.put(3,"Cheese");
                map.put(4,"Tomatoes");
                map.put(5,"Chillies");

        System.out.println(map);

       Integer s = map.firstKey();
       System.out.println(s);

       Set<Map.Entry<Integer,String>> set = map.entrySet();
       for(Map.Entry<Integer,String> entries:set){
           System.out.println("Key:"+" "+entries.getKey()+" "+"Value:"+" "+entries.getValue());
       }

    }
}
