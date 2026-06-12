package Core_Functional_Interfaces;
import java.util.function.*;
public class Supplier_Interface {
    public static void main(String[] args) {
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

    }
}
