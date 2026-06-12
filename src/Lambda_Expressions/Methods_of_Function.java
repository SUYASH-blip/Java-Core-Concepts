package Lambda_Expressions;

import java.util.function.Function;

public class Methods_of_Function {
    public static void main(String[] args) {

        // suppose we have an equation ((x+2)*3)
        //instead of solving it directly using Function we can break it into parts example:-

        Function<Integer,Integer> equations = x -> ((x+2)*3);//Method-1 direct solving making code complex

        Function<Integer,Integer> add2 = x->x+2;
        Function<Integer,Integer> multiply3 = x->x*3;
        int addresult = add2.apply(2);
        int multiplyresult = multiply3.apply(addresult);

                         //OR
        int mulresult = multiply3.apply(add2.apply(2));
        System.out.println(mulresult);   //But this method is also making our code very complex.

        //That's why java has introduced andThen() method it is a defined
        // method in the Function functional interface

        int res = add2.andThen(multiply3).apply(2);

        //This is very helpful for solving complex equations.
    }
}
