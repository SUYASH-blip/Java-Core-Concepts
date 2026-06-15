package Practice;

import java.util.function.*;

public class Practice5 {
    public static void main(String[] args) {
        Function<Integer,Integer> f1 = x -> x*x;
        System.out.println(f1.apply(2));
        Consumer<String> c1 = x -> System.out.println(x+" ,"+"String consumed");
        c1.accept("Java");
        Supplier<String> s1 = () -> new String("Hello");
        s1.get();
        Predicate<Integer> p1 = x -> x %2 == 0;
        System.out.println(p1.test(2));
        IntFunction<String> i1 = x -> String.valueOf(x);
        System.out.println( i1.apply(25));
        ToIntFunction<String> t1 = x -> Integer.parseInt(x);
        System.out.println(t1.applyAsInt("123"));
         //(x*2)+(x*3)-x
        Function<Integer,Integer> i2 = x -> (x*2);
        Function<Integer,Integer> i3 = x -> (x*3);
       // Function<Integer,Integer> i4 = x -> ;

        Function<Integer,Integer> i4 = i2.andThen(i3);
        System.out.println(i4.apply(2));




    }
}
