package STREAMS;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Basic_Stream_Generation {
    public static void main(String[] args) {



        Stream<Integer> s1 = Stream.of(1,2,3,4,5,6,7,8,9,10);

      s1 =  s1.filter(x -> x>=5);
      s1 =  s1.map(x -> x*2);
      s1.forEach(System.out::println);


    }
}
