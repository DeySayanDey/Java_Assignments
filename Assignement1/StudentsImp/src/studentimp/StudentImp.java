package studentimp;

import mypackage.Student;

public class StudentImp {
    public static void main(String[] args) {
        // Creating student objects
        Student s1 = new Student("Sayan Dey", 9, 82, "2024");
        Student s2 = new Student("Umi Dey", 24, 85, "2024");
        Student s3 = new Student("Srija Dey", 31, 92, "2025");

        // Displaying student information
        s1.display();
        s2.display();
        s3.display();

        // Displaying roll number and name
        s1.displayRollName();
        s2.displayRollName();
        s3.displayRollName();
    }
}