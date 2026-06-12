package Core_Functional_Interfaces;
import java.util.function.*;

public class Function_Interface {
    public static void main(String[] args) {


        Function<Integer, Integer> square = (x) -> x * x;
        System.out.println(square.apply(5));
    }
}
