package Core_Functional_Interfaces;

import java.util.function.Predicate;

public class Predicate_Chaining {
    //Real use case scanrio based program suppose we have to check a student eligibility multiple times
    public static void main(String[] args) {
        Predicate<Student> age_verification = s -> s.age >= 18;
        Predicate<Student> marks_verification = s ->s.marks>=90;

        Predicate<Student> isEligible = age_verification.and(marks_verification);
        System.out.println(isEligible.test(new Student(18,91)));
    }



}
class Student{
    int age ;
    int marks;

    Student(int age,int marks){
        this.age = age;
        this.marks = marks;
    }
}
