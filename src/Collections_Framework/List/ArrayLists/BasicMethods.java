package Collections_Framework.List.ArrayLists;
import java.util.ArrayList;
import java.util.List;
public class BasicMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Suyash");
      //  list.add("Tushar");
        list.add("Vinay");
      //  list.add("Tanish");
        list.add("Vinayak");
        list.add(5,"Swati");
        list.get(0);
        System.out.println();
        boolean y = list.contains("Swati");
        System.out.println(y);
        list.remove(5);
        boolean z = list.contains("Swati");
        System.out.println(z);

        //For each Printing
        for(String x:list){
            System.out.println(x);
        }

        //Direct Printing Because of toString()
        System.out.println(list);


    }
}
