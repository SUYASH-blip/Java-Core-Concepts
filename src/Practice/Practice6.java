package Practice;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Practice6 {
    public static void main(String[] args) {


        List<Integer> s1 = new ArrayList<>(List.of(1,2,3,4,5,6,78,78,99,101));

      List<Integer> result =  s1.stream()
        .filter(x -> x % 2 == 0)
                .map(x -> x * 5)
                .toList();

        System.out.println(result);




    }
}
