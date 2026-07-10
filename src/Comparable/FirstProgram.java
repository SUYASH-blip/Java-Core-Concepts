package Comparable;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int marks;
    String name;
    int roll_no;

    Student(int marks,String name,int roll_no){
        this.marks = marks;
        this.name = name;
        this.roll_no = roll_no;
    }

    @Override
    public int compareTo(Student other){
        return other.marks - this.marks;
        }

}
public class FirstProgram {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(98,"SUYASH",21));
        students.add(new Student(65,"Tushar",50));
        students.add(new Student(72,"Tanish",38));
        students.add(new Student(65,"Vinay",73));
       // students.add(new Student(34,"Vinayak",4));

        Collections.sort(students);

        for(Student s : students){
        //    System.out.println(s.marks+" , "+s.name+" , "+s.roll_no);
        }
    }
}
