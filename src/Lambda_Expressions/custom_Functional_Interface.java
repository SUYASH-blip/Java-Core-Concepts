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
/* basically there can be a doubt that there is no body of the add method it is only
defined in the interface, but the main hero here is the "LAMBDA EXPRESSIONS"
in the add method we are taking a Calculator type object but we are passing an lambda
expression in the print calling time so internally java will store that lambda expression inside
the object of type calculator and when we write c.add() the add method will use the logic of the lambda expression
being provided.
*/