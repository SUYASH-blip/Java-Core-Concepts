package Practice;
import java.util.*;

public class Practice4 {
    public static void main(String[] args) {
        List<Students> s = new LinkedList<>();
        s.add(new Students(95,"Suyash",21));
        s.add(new Students(94,"Jay",22));
        s.add(new Students(93,"Vijay",20));

        Comparator<Students> work = (s1,s2) -> s1.marks-s2.marks;
        Collections.sort(s,work);

        for(Students st:s){
            System.out.println(st.marks+" , "+st.name+" , "+st.roll);
            System.out.println("Hello");  //proxy
        }
    }
}
class Students{
    int marks;
    String name;
    int roll;
    String address;

    public Students(int marks, String name, int roll) {
        this.marks = marks;
        this.name = name;
        this.roll = roll;
    }
}
