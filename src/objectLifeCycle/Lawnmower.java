package objectLifeCycle;

import operators.Student;

/**
 * Created by ronald on 05/01/17.
 */
public class Lawnmower {

    Student student = new Student();

    Lawnmower(){

        new Student();

        student.YesOrNo(false);
        student.getMoreOfIt();

    }

    public static void main(String[] args) {
        new Lawnmower();
    }
}

