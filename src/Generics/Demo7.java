package Generics;

public class Demo7 {

        public static void main(String[] args) {
            Box3<Fish> b1 = new Box3<>();
        }
    }

    class Box3<T extends Animal & Swimmable> {
        T value;
    }

    class Animal {
        void display() {
            System.out.println("Displaying Animal");
        }
    }

    interface Swimmable {
        void swim();
    }

    class Dog extends Animal {

    }

    class Fish extends Animal implements Swimmable {
        @Override
        public void swim() {
            System.out.println("Fish is swimming");
        }
    }


