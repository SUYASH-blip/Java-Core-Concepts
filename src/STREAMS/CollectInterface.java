package STREAMS;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectInterface {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8));

        //we have 3 diff types to collect
          // 1.toList()
          // 2.toSet()
          // 3.toMap()


        // One of the most powerful terminal operations.
        // Uses Collector implementations to collect stream data
        // into different data structures.

        List<Integer> list3 = list.stream()
                .map(x -> x + 1)
                .collect(Collectors.toList());

        // 1.Collectors.toList() generally returns a mutable list.

        list3.add(4);
        System.out.println(list3);


        //2.collectors.toSet

        Set<Integer> set = list.stream()
                .filter(x -> x > 0)
                .map(x -> x * 2)
                .collect(Collectors.toSet());

        System.out.println(set);


        //3.collectors.toMap
        // Takes Two functions 1.keyMapper
        //                     2.valueMapper

        List<String> string = new ArrayList<>(List.of("AA","BBB","CCCC"));

        Map<Integer,String> result = string.stream()
                .collect(Collectors.toMap(
                        x -> x.length(),
                        x -> x
                ));

        System.out.println(result);


        //groupingBy() :- groups elements of a Stream on the basis of keys,multiple groups me data ko divide bhi karta he

        List<String> string2 = new ArrayList<>(List.of("AA","BBB","CCCC","DD","EEE"));

        Map<Integer,List<String>> result2 = string2.stream()
                .collect(Collectors.groupingBy(x -> x.length()));

        System.out.println(result2);


        //partitioningBy() :- it makes only 2 groups ek true ka and ek false ka,returns boolean,List<T>

        Map<Boolean,List<Integer>> result3 = list.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));

        System.out.println(result3);

        //mapping() :- groupingBy ke ander use hota he isko 2 chize deni padti he 1.mapper (Values kaise chahiye
        // example toUpperCase,toLowerCase etc and 2.downstream :- yani data kis format me chahiye example list
        // likhte kaise he Collectors.toList().


        Map<Integer,List<String>> result4 = string2.stream()
                .collect(Collectors.groupingBy(x -> x.length(),

                        Collectors.mapping(
                                x -> x.toLowerCase(),
                                Collectors.toList())));

        System.out.println(result4);


        //joining(Delimitor:) :- joins elements of a stream on the basis of a delimiter

        String result5 = string2.stream()
                .collect(Collectors.joining("-"));

        System.out.println(result5);
    }
}
