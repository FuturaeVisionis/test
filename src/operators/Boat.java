package operators;

/**
 * Created by ronald on 05/01/17.
 */
public class Boat {

    public static void main(String[] args) {

        Student.moon = false; // static variable = global variable (belongs to the class and not the object) All the objects can use it

        Student college = new Student();

        System.out.println(college.moon);

        college.moon = true; // you can also use

        System.out.println(Student.moon);

    }
}
