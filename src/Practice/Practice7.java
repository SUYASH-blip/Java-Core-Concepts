package Practice;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Practice7 {
    public static void main(String[] args) {
        List<Student3> s2 = new ArrayList<>(List.of(
                new Student3(99,"A",1),
                new Student3(39,"B",22)

        ));

        Comparator<Student3> logic = (x,y) -> y.marks - x.marks;
        Collections.sort(s2,logic);
        for(Student3 students : s2){
            System.out.println(students.marks+" "+ students.roll+" "+students.name);
        }
    }
}
class Student3{
    int marks;
    String name;
    int roll;

    public Student3(int marks, String name, int roll) {
        this.marks = marks;
        this.name = name;
        this.roll = roll;
    }
}

