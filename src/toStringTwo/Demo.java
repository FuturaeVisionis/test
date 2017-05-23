package toStringTwo;

import java.util.ArrayList;

/**
 * Created by ronald on 09/10/16.
 */
public class Demo {
    public static void main(String[] args) {

        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("Josephine", 26));
        al.add(new Student("James", 22));
        al.add(new Student("Claudia", 23));
        al.add(new Student("Cynthia", 25));
        al.add(new Student("Casper", 26));

        for (Student tmp : al) {
            System.out.println(tmp);
        }
    }

}
