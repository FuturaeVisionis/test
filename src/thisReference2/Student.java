package thisReference2;

/**
 * Created by ronald on 27/12/16.
 */
public class Student {

    String name;
    int rollNumber;
    int marks1, marks2, marks3;

    public Student(String name, int rollNumber, int marks1, int marks2, int marks3) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        System.out.println(name + rollNumber + marks1 + marks2 + marks3);
    }

    public Student(String name, int rollNumber) {
        this(name, rollNumber, -1, -1, -1);
        System.out.println(name + rollNumber);
    }

    public Student(String rollNumber) {
        this(null, -101);
        System.out.println(rollNumber);
    }

    public static void main(String[] args) {
        Student student = new Student("Hello world");

    }
}
