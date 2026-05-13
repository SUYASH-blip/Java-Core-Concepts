package Collections_Framework.List.ArrayLists;
import java.util.*;
public class List_of_Method {
    public static void main(String[] args) {
       /* ArrayList<String> l1 = List.of("Radhe","Govind","Kanha");
       this is wrong because List of me jo bhi pass karenge vo usi ki immutable
       list return karega yaha pe string he and hm usko arraylists me store kara rhe he
       thats why it is showing error
        */

        //Correct way
        List<String> l1 = List.of("Radhe","Govind");

        try {
            l1.add("0"); //Not ALLOWED
        }
        catch (RuntimeException e){
            System.out.println("Not allowed");
        }
        System.out.println(l1);
    }
}
