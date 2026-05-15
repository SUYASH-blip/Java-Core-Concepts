package Map.IdentityHashMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class BasicProgram {
    public static void main(String[] args) {
        String key1 = new String("Key");
        String key2 = new String("Key");

        /*String class hashcode and equals method used that's why both key objects
        are same*/

        Map<String,Integer> map1 = new HashMap<>();
        map1.put(key1,1);
        map1.put(key2,2);
        System.out.println(map1);
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());

        /*IdentityHashMap uses Objects class hashcode method and
        for comparison uses == operator that's why both key objects are
        different.
        */


        Map<String,Integer> map2 = new IdentityHashMap<>();
        map2.put(key1,1);
        map2.put(key2,2);
        System.out.println(map2);
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));



    }
}
