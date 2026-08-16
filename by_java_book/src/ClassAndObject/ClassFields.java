package ClassAndObject;

public class Student {
    String name;
    int age;

    // Static (class) field
    static String schoolName = "ABC Public School";

    public Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    void display() {
        System.out.println(name + " studies at " + schoolName);
    }
}

public class ClassFields {
    public static void main(String[] args) {
        Student s1 = new Student("Ravi", 21);
        Student s2 = new Student("Meena", 22);

        s1.display(); // Ravi studies at ABC Public School
        s2.display(); // Meena studies at ABC Public School

        // Change static field
        Student.schoolName = "XYZ International School";

        s1.display(); // Ravi studies at XYZ International School
        s2.display(); // Meena studies at XYZ International School
    }
}


