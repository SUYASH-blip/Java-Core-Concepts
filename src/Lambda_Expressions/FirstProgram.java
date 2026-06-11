package Lambda_Expressions;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

class Student{
    int marks;
    String name;
    int roll_no;

    Student(int marks,String name,int roll_no){
        this.marks = marks;
        this.name = name;
        this.roll_no = roll_no;
    }
}
//class SortByMarks implements Comparator<Student> {
//    @Override
//    public int compare(Student s1,Student s2){
//        return s1.marks - s2.marks;
//    }
//        }
public class FirstProgram {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(98,"SUYASH",21));
        students.add(new Student(65,"Tushar",50));
        students.add(new Student(72,"Tanish",38));
        students.add(new Student(65,"Vinay",73));
        students.add(new Student(34,"Vinayak",4));

        Collections.sort(students,(s1, s2) -> s2.marks-s1.marks);

        for(Student s : students){
            System.out.println(s.marks+" , "+s.name+" , "+s.roll_no);
        }

    }
}
