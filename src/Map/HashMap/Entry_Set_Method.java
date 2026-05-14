package Map.HashMap;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class Entry_Set_Method {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Suyash");
        map.put(2,"Jaydeep");
        map.put(3,"Swati");

        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        for(Map.Entry<Integer,String> entry:entries){
            System.out.println("Key:"+" "+entry.getKey()+" "+"Value:"+" "+entry.getValue());
        }
    }
}
