package Practice;

import java.util.ArrayList;
import java.util.List;

public class Practice1{
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>(List.of(1,2,3,4,5));
        Type<String> t1 = new Type<String>();
        t1.getValue("Suyash");
      t1.printList(l);


    }
}

class Type<T>{
    public T value;

    public void getValue(T value)
    {
    this.value = value;
    }

    public void printList(List<?> l){
    l.forEach(System.out::println);
    }
}