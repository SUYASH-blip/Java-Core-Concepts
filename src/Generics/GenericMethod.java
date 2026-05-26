package Generics;



public class GenericMethod {
    public static void main(String[] args) {

        Integer x = getValue(99);
        System.out.println(x);
        String z = getValue("Suyash Giri is very intelligent!!");
        System.out.println(z);
        printValue(101,"Jay Shri Radhe");
    }
    public static <T> T getValue(T value){
        return value;
    }
    public static <T,U> void printValue(T x,U y){
        System.out.println(x + " "+ y);
    }
}


