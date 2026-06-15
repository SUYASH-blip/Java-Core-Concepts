package STREAMS;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

import static java.util.Locale.filter;

public class Intermediate_Functions {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(List.of(1, 4, 11, 13, 34));

        //intermediate functions
           list.stream()
                .filter(x -> x>10)
                .map(x -> x*2)    //Takes function object and used to transform data
                .forEach(System.out::println);


        List<List<Integer>> l2 = List.of(
                List.of(1,2,3),
                List.of(4,5,6),
                List.of(7,8,9)
        );

        l2.stream()
                .flatMap(x -> x.stream())
                .map(x -> x * 2)
                .forEach(System.out::println);  /*Here we cannot use map function directly to convert individual
                list into stream source because map function maintains hierarchy but flatmap makes collection flat
                and does not maintain hierarchy.*/


        //Sorted() method --> It is a stateful method it waits for all elements to come to it then works,it
        //takes a comparator object so we can also pass lambda expressions in it for specific type of sorting
        //Example for descending order sorting we can use the lambda (a,b) -> b - a.

        //Example:-

        list.stream()
                .filter(x -> x >10)
                .map(x -> x * 2)
                .sorted()
                .forEach(System.out::println);



        //distinct() method --> uses hashing to remove duplicate values
        list.stream()
                .distinct()
                .forEach(System.out::println);



        //limit() --> use to set a limit on a infinite stream
        //skip() --> use to skip some iterations

             Stream.iterate(1, x -> x + 1)
                .limit(20)
                .skip(7)
                .forEach(System.out::println);


        //peek() method -> used to get a view of a stream at a specific instance ,mainly used for Debugging

             list.stream()
                     .filter(x -> x >10)
                     .map(x -> x * 2)
                     .peek(System.out::println)
                     .sorted()
                     .forEach(System.out::println);

        }
}
