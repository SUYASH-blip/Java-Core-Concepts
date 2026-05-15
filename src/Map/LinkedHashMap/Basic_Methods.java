package Map.LinkedHashMap;

import java.util.LinkedHashMap;

public class Basic_Methods {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lmap = new LinkedHashMap<>(5,0.5f,true);
        lmap.put("Suyash",94);
        lmap.put("Tushar",82);
        lmap.put("Vinay",75);
        lmap.put("Tanish",79);
        Integer i =  lmap.get("Suyash");
        lmap.get("Tanish");
        lmap.get("Vinay");

        System.out.println(i);
     //   lmap.put("Suyash",95);
        System.out.println(lmap);
        Integer x =  lmap.getOrDefault("Jay",30);
        System.out.println(x);
        lmap.putIfAbsent("Jay",30);

    }
}
