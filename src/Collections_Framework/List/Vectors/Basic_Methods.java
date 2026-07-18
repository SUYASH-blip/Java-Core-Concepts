package Collections_Framework.List.Vectors;

import java.util.Vector;

public class Basic_Methods {
    public static void main(String[] args) {
        Vector<Integer> vector1 = new Vector<>();
        Vector<Integer> vector2 = new Vector<>(25,2);
        Vector<Integer> vector3 = new Vector<>(vector2);
        vector1.capacity();
        vector2.capacity();
        vector3.capacity();
        vector1.add(1);
        vector1.add(2);
        vector1.add(3);
        vector1.add(4);
        vector1.add(5);
        vector1.add(6);
        vector2.add(7);
        vector2.add(8);
        vector2.add(9);
        vector2.add(10);
        vector3.add(11);
        vector3.add(12);
        vector3.add(13);
        vector3.add(14);

      boolean result =  vector1.equals(vector2);
        System.out.println(result);
        System.out.println(vector1);
        System.out.println(vector2);
       // System.out.println(vector3);


/*vector 3 ke constructor me hamne pehle vector2 ko likha jab usme kuch bhi
        data nhi tha isliye vector 3 me sirf usi ke elements he.*/
    }
}
