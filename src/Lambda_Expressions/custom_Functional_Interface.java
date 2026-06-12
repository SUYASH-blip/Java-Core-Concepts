package Lambda_Expressions;

@FunctionalInterface
 interface Calculator{
    public int add(int a,int b);



        }

public class custom_Functional_Interface {
    public static void main(String[] args) {
        Calculator c = (a, b) -> a + b;
        print(5, 3, c);                 //Method-1
        print(5, 3, (a, b) -> a + b);   //Method-2


    }
            public static void print(int a ,int b, Calculator c){
            System.out.println(c.add(5,3));


    }

}
