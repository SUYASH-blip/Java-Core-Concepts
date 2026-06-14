package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    @Override
    public int compareTo(Student other) {
        return this.marks-other.marks;
    }
    @Override
    public String toString(){
        return String.valueOf(this.marks);

    }
    int marks;
    Student(int marks){
        this.marks = marks;
    }
}


public class Practice3 {

    public static void main(String[] args) {
        List<Student> s1 = new ArrayList<>();
        s1.add(new Student(25));
        s1.add(new Student(26));
        s1.add(new Student(267));
        s1.add(new Student(9500));


        Collections.sort(s1);
       for(Student s : s1){
           System.out.println(s.toString());
       }
    }

}
