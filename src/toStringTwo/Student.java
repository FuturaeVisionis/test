package toStringTwo;

/**
 * Created by ronald on 09/10/16.
 */
public class Student {

    private String studentname;
    private int studentage;

    public Student(String studentname, int studentage) {
        this.studentname = studentname;
        this.studentage = studentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentname='" + studentname + '\'' +
                ", studentage=" + studentage +
                '}';
    }
}
