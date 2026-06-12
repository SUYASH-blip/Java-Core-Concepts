package Core_Functional_Interfaces;
import java.util.function.*;
public class Consumer_Interface {
    public static void main(String[] args) {
        Consumer<Integer> acc = (x) -> System.out.println("Accepted");
        acc.accept(8);
    }
}
