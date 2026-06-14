package Generics;

public class Demo7 {

        public static void main(String[] args) {
            Box3<Fish> b1 = new Box3<>();
            b1.print();
        }
    }

    class Box3<T extends Animal & Swimmable> {
        T value;
        public static void print(){
            System.out.println("Hello form box");
        }
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


