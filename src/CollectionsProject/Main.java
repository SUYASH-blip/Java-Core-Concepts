package CollectionsProject;
import java.util.*;
public class Main {



        static ArrayList<Student> students = new ArrayList<>();
        static HashMap<Integer, Student> studentMap = new HashMap<>();

        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {

            while (true) {
                System.out.println("\n===== Student Management System =====");
                System.out.println("1. Add Student");
                System.out.println("2. View All Students");
                System.out.println("3. Search Student by ID");
                System.out.println("4. Update Student");
                System.out.println("5. Delete Student");
                System.out.println("6. Sort by Name");
                System.out.println("7. Sort by Marks");
                System.out.println("8. Exit");

                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1 -> addStudent();
                    case 2 -> viewStudents();
                    case 3 -> searchStudent();
                    case 4 -> updateStudent();
                    case 5 -> deleteStudent();
                    case 6 -> sortByName();
                    case 7 -> sortByMarks();
                    case 8 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> System.out.println("Invalid choice!");
                }
            }
        }

        // Add Student
        static void addStudent() {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            if (studentMap.containsKey(id)) {
                System.out.println("Student already exists!");
                return;
            }

            sc.nextLine(); // consume newline
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            Student s = new Student(id, name, marks);
            students.add(s);
            studentMap.put(id, s);

            System.out.println("Student Added!");
        }

        // View Students
        static void viewStudents() {
            if (students.isEmpty()) {
                System.out.println("No students found!");
                return;
            }

            for (Student s : students) {
                System.out.println(s);
            }
        }

        // Search
        static void searchStudent() {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            Student s = studentMap.get(id);

            if (s != null) {
                System.out.println("Found: " + s);
            } else {
                System.out.println("Student not found!");
            }
        }

        // Update
        static void updateStudent() {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            Student s = studentMap.get(id);

            if (s == null) {
                System.out.println("Student not found!");
                return;
            }

            sc.nextLine();
            System.out.print("Enter New Name: ");
            s.setName(sc.nextLine());

            System.out.print("Enter New Marks: ");
            s.setMarks(sc.nextDouble());

            System.out.println("Updated Successfully!");
        }

        // Delete
        static void deleteStudent() {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            Student s = studentMap.remove(id);

            if (s != null) {
                students.remove(s);
                System.out.println("Deleted Successfully!");
            } else {
                System.out.println("Student not found!");
            }
        }

        // Sort by Name
        static void sortByName() {
            students.sort(Comparator.comparing(Student::getName));
            System.out.println("Sorted by Name!");
        }

        // Sort by Marks
        static void sortByMarks() {
            students.sort(Comparator.comparingDouble(Student::getMarks).reversed());
            System.out.println("Sorted by Marks!");
        }
    }

