package operators;

/**
 * Created by ronald on 03/01/17.
 */
public class Student {

    private double marks1 = 2;
    private double marks2 = 4;
    private double marks3 = 6;
    private double maxMarks = 2;

    static boolean moon = true;
    boolean star = false;


    private double getAverage() {
        double avg = ((marks1 + marks2 + marks3) / (maxMarks * 3) * 100);
        boolean star = false;
        return avg;
    }

    public int getMoreOfIt() {
        int a = 5;
        System.out.println(a);
        return a;
    }

    public boolean YesOrNo(boolean star) {

        if (this.star == true) {
            System.out.println("Yes man!");
        } else {
            System.out.println("No man!");
        }
        return star;
    }

    public static void main(String[] args) {

        Student student = new Student();
        System.out.println(student.getAverage());

        student.YesOrNo(true);

        student.getMoreOfIt();
    }
}
