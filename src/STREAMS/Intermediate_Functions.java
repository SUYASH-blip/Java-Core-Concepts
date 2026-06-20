package STREAMS;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Intermediate_Functions {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 4, 11, 13, 34));

        // =========================================================
        // 1. filter() + map()
        // =========================================================
        // filter() -> Elements ko condition ke basis par select karta hai.
        // map()    -> Har element ko transform/modify karta hai.
        // Stream ka original data modify nahi hota.

        list.stream()
                .filter(x -> x > 10)
                .map(x -> x * 2)
                .forEach(System.out::println);


        // =========================================================
        // 2. flatMap()
        // =========================================================
        // map() hierarchy maintain karta hai.
        // flatMap() nested collections ko flatten karke
        // ek single stream me convert kar deta hai.

        List<List<Integer>> l2 = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );

        l2.stream()
                .flatMap(List::stream)
                .map(x -> x * 2)
                .forEach(System.out::println);


        // =========================================================
        // 3. sorted()
        // =========================================================
        // Stateful Intermediate Operation
        // Ye sabhi elements collect hone ka wait karta hai,
        // phir sorting perform karta hai.
        //
        // Default -> Ascending Order
        // Descending Example:
        // sorted((a, b) -> b - a)

        list.stream()
                .filter(x -> x > 10)
                .map(x -> x * 2)
                .sorted()
                .forEach(System.out::println);


        // =========================================================
        // 4. distinct()
        // =========================================================
        // Duplicate elements remove karta hai.
        // Internally hashing ka use karta hai.

        list.stream()
                .distinct()
                .forEach(System.out::println);


        // =========================================================
        // 5. limit() and skip()
        // =========================================================
        // limit(n) -> Stream ke first n elements leta hai.
        // skip(n)  -> First n elements ignore karta hai.
        //
        // Infinite Streams ke sath limit() bahut useful hai.

        Stream.iterate(1, x -> x + 1)
                .limit(20)
                .skip(7)
                .forEach(System.out::println);


        // =========================================================
        // 6. peek()
        // =========================================================
        // Mainly debugging ke liye use hota hai.
        // Stream pipeline ke kisi bhi stage par elements
        // ko inspect/view kar sakte hain.
        //
        // Production code me side-effects ke liye use nahi karna chahiye.

        list.stream()
                .filter(x -> x > 10)
                .map(x -> x * 2)
                .peek(x -> System.out.println("After Map: " + x))
                .sorted()
                .forEach(System.out::println);
    }
}