package STREAMS;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Terminal_functions {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(
                List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        );

        // =========================================================
        // 1. Collecting Results
        // =========================================================

        // toList()
        // Returns an immutable list (cannot be modified).

        List<Integer> list2 = list.stream()
                .map(x -> x + 1)
                .toList();

        // collect()
        // One of the most powerful terminal operations.
        // Uses Collector implementations to collect stream data
        // into different data structures.

        List<Integer> list3 = list.stream()
                .map(x -> x + 1)
                .collect(Collectors.toList());

        // Collectors.toList() generally returns a mutable list.

        list3.add(4);
        System.out.println(list3);


        // =========================================================
        // 2. reduce()
        // =========================================================
        // Used to combine all stream elements into a single value.
        //
        // Example:
        // Sum, Product, Maximum, Minimum, String Concatenation, etc.

        // Method 1: Without Identity Value
        // Returns Optional because stream may be empty.

        Optional<Integer> sum = list.stream()
                .reduce((a, b) -> a + b);

        System.out.println(sum.get());

        // Method 2: With Identity Value
        // Returns direct result (not Optional).

        int sum2 = list.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum2);


        // =========================================================
        // 3. count()
        // =========================================================
        // Returns the number of elements remaining after all
        // intermediate operations are applied.

        long count = list.stream()
                .filter(x -> x > 10)
                .map(x -> x * 9)
                .count();

        System.out.println(count);


        // =========================================================
        // 4. findFirst()
        // =========================================================
        // Returns the first element matching the pipeline.
        // Performs short-circuiting (stream stops after finding result).

        Optional<Integer> first = list.stream()
                .filter(x -> x > 10)
                .map(x -> x * 9)
                .findFirst();

        // Use isPresent() before get() in production code.

        if (first.isPresent()) {
            System.out.println(first.get());
        }


        // =========================================================
        // 5. findAny()
        // =========================================================
        // Similar to findFirst().
        // Mainly useful in parallel streams for better performance.

        // Optional<Integer> any = list.stream().findAny();


        // =========================================================
        // 6. Matching Operations
        // =========================================================

        // anyMatch()
        // Returns true if at least one element matches condition.

        boolean anyMatch = list.stream()
                .filter(x -> x > 10)
                .map(x -> x * 9)
                .anyMatch(x -> x % 2 == 0);

        System.out.println(anyMatch);

        // allMatch()
        // Returns true if all elements satisfy condition.

        // noneMatch()
        // Returns true if no element satisfies condition.


        // =========================================================
        // 7. sum()
        // =========================================================
        // Available only on primitive streams
        // (IntStream, LongStream, DoubleStream).

        int sum3 = list.stream()
                .filter(x -> x > 10)
                .map(x -> x * 9)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum3);


        // =========================================================
        // 8. max() and min()
        // =========================================================
        // Available on primitive streams.
        // Returns OptionalInt because stream may be empty.

        OptionalInt max = list.stream()
                .filter(x -> x > 10)
                .map(x -> x * 9)
                .mapToInt(Integer::intValue)
                .max();

        System.out.println(max);

        // Similarly:

        // OptionalInt min = list.stream()
        //         .mapToInt(Integer::intValue)
        //         .min();
    }
}