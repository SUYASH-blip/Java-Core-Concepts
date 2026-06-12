package Core_Functional_Interfaces;
import java.util.function.*;
public class Predicate_Interface {
    public static void main(String[] args) {
        Predicate<Integer> ans = (x) -> (x%2==0);
        System.out.println(ans.test(8));
    }
}
