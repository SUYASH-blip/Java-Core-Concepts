package Generics;
import java.util.ArrayList;
import java.util.List;

public class Invariance {
    public static void main(String[] args) {




                List<Dog3> dogs = new ArrayList<>();
                dogs.add(new Dog3());
                dogs.add(new Dog3());

                fun(dogs);

                // List<Animal> animals = new ArrayList<>();
                // animals.add(new Animal());
                // animals.add(new Animal());

                // fun(animals);
            }

            // static void fun(List<Animal> animals) {
            //     for(Animal animal : animals) {
            //         animal.eat();
            //     }
            // }

            static void fun(List<?> values) {
                // for(Object obj : values) {
                //     System.out.println(obj.getClass().getName());
                // }
                //values.add(new Dog()); // wrong

                Object obj = values.get(0);
                Animal3 a = (Animal3) obj;
                System.out.println(obj.getClass().getName());
            }
        }

        class Animal3 {
            void eat() {
                System.out.println("Eating");
            }
            void walk() {
                System.out.println("Walking");
            }
        }

        class Dog3 extends Animal3 {
            void bark() {
                System.out.println("Barking");
            }
        }


