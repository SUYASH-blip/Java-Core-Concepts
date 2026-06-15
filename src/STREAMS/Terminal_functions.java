package STREAMS;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Terminal_functions {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        //1. Collecting Results:-
             //a.  toList:- return immutable list
             //b.  collect:- one of the most powerful methods in whole streams topic
             //    because there is a separate interface "Collector" which provides multiple methods to collect a
             //    stream in different ways.

        List<Integer> list2 = list.stream()
                .map(x -> x + 1)
                .toList();


        List<Integer> list3 = list.stream()
                .map(x -> x + 1)
                .collect(Collectors.toList());  //mutable list, Collectors is a implementation class of the collector
                                               // interface

        list3.add(4);
        System.out.println(list3);



        //2. Reducing Streams:- combines streams all elements into a single value
        //There are two overloaded methods of the reduce()

        //1.Method - 1 :-

        Optional<Integer> sum = list.stream()
                .reduce((a,b) -> a + b);
        System.out.println(sum.get());

        //Method-2 :-

        int sum2 = list.stream()
                .reduce(0,(a,b) -> a + b);
        System.out.println(sum2);


        //count() --> return number of elements which passed all the filters

        long ans = list.stream()
                .filter(x -> x >10)
                .map(x -> x * 9)
                .count();             //returns a long value
        System.out.println(ans);

       //FindFirst():- Returns first element to pass all the filters , it performs short circuiting becuase after
        // returning a value it closes the stream

       Optional<Integer> o = list.stream()
                .filter(x -> x >10)
                .map(x -> x * 9)
                .findFirst();

        System.out.println(o.get());

        //Similarly FindAny mostly used for parallel streams

        //AnyMatch():- returns a boolean value

        boolean bool = list.stream()
                .filter(x -> x >10)
                .map(x -> x * 9)
                .anyMatch(x -> x -2 == 0);

        System.out.println(bool);

        //Similarly allMatch() and noneMatch()

        //sum() works with primitive stream

      int sum3 =  list.stream()
                .filter(x -> x >10)
                .map(x -> x * 9)
                .mapToInt(x -> x)
                .sum();

        System.out.println(sum3);

        //max() and min() returns optional

        OptionalInt o2 = list.stream()
                .filter(x -> x >10)
                .map(x -> x * 9)
                .mapToInt(x -> x)
                .max();

        System.out.println(o2);








    }
}
