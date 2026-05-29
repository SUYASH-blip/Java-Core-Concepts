package Generics;
import java.util.ArrayList;
import java.util.List;

//Arrays are covariant in nature they allowed this concept but ends in getting runtime error

public class Covariant {
    public static void main(String[] args) {
        // Invariant in generics
        //Animal animal = new Dog();
        // animal.eat();
        // animal.walk();

        // List<Dog> dogs = new ArrayList<>();
        // List<Animal> animals = dogs;

        Dog2[] dogs = new Dog2[10];
        Animal2[] animals = dogs;

        animals[0] = new Dog2();
        animals[1] = new Dog2();
        animals[2] = new Dog2();
        animals[3] = new Dog2();
        animals[4] = new Animal2();

        for(Animal2 animal : animals) {

            if(animal == null) {
                continue;
            }

            animal.eat();
        }

    }
}

class Animal2{
    void eat() {
        System.out.println("Eating");
    }
    void walk() {
        System.out.println("Walking");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("Barking");
    }
}