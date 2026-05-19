package ImmutableClasses;
public class Demo2 {
    public static void main(String[] args) {
        College2 college = new College2("IIT G", "Assam");

        Student2 s1 = new Student2(28, "Aditya", college);

        System.out.println(s1.getCollege().name); // IIT G

        s1.getCollege().name = "IIT B";

        System.out.println(s1.getCollege().name); // IIT G
    }
}

// Immutable
// defensive copy of college (non primitive)
final class Student2 {
    private final int age;
    private final String name;
    private final College college;

    Student2(int age, String name, College2 college) {
        this.age = age;
        this.name = name;
        this.college = new College(college.name, college.address);
    }

    // getters
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public College getCollege() {
        return new College(this.college.name, this.college.address);
    }
}

// Mutable
class College2 {
    String name;
    String address;

    College2(String name, String address) {
        this.name = name;
        this.address = address;
    }
}