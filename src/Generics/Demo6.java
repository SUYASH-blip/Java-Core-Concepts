package Generics;

public class Demo6 {

        public static void main(String[] args) {
            Box2<Integer> b1 = new Box2<>();
            b1.value = 5;
            b1.printDouble();
        }
    }
// Generics --> T can be anything
// Bounds in Generics
// Upper bound --> T is atleast Number or its subtype

    class Box2<T extends Number> {
        T value;

        public void printDouble() {
            System.out.println(value.doubleValue());
        }
    }

