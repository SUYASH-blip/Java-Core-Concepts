package Generics;

public class GenericClass {
    public static void main(String[] args) {
       Box<Integer> b1 = new Box<>(23);
        Box<String> b2 = new Box<>("Suyash Giri");
        Box<Double> b3 = new Box<>(23.005);

        System.out.println(b1.getValue());
        System.out.println(b2.getValue());
        System.out.println(b3.getValue());

    }
    }
class Box<T>{  //Type Parameter
    private T value;

    Box(T value){
        this.value = value;
    }

 //   public void setValue(T value){
  //      this.value = value;
//}
    public  T getValue(){
        return value;
    }
}
