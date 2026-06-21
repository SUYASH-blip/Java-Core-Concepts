package Practice;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamPractice1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,10,6,9,8,7,5));

       List<Integer> result =  Stream.iterate(1,x -> x * 2)
                .filter(x -> x > 0)
                .limit(5)
                .skip(2)
                .map(x -> x + 1)

                .toList();

        System.out.println(result);


    }
}
