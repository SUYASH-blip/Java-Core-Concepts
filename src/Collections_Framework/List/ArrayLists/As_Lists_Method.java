package Collections_Framework.List.ArrayLists;
import java.util.*;
public class As_Lists_Method {
    public static void main(String[] args) {
        List<String> List1 = Arrays.asList("Suyash","Kanha","govind");//To make it more Flexible
        //as lists when stored like this is even when stored in a lists but it is restricted.
        List1.remove("Suyash");//will throw Runtime error
        // List1.add("Jay");//Same error
         List1.set(0,"Radhe");
         System.out.println(List1);

    }
}
