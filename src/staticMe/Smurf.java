package staticMe;

/**
 * Created by ronald on 27/12/16.
 */
public class Smurf {

    String name = "Baby";
    static final int number = 30;


    /**
     * static variable belongs to a class. They don't belong to an instance (object).
     * static variable EXIST independently of any instance of a class.
     * They may be accessed even if no instances of the class have been created.
     * A static variable can be accessed using the name of the object reference variable or the name of the class.
     *
     * --> Though you can define a constant as a non-static member, it is common practice to define constants as static
     * members, as doing so allows the constant values to be used across objects and classes.
     *
     * --> The non-private static variables and methods are INHERITED by derived classes.The static members aren't
     *  involved in runtime polymorphism. You can't override the static members in a derived class, but you can redefine them.
     *
     * --> You can't define a top level class or interface as static, but you can define a nested class or interface as static.
     */

    public static void main(String[] args) {

        Smurf smurf = new Smurf();

        System.out.println(smurf.name);

        System.out.println(smurf.number); // <-- using the object reference variable
        System.out.println(Smurf.number); // <-- using the class name is the proper way.
        System.out.println(number); // <-- the lazy way.

    }
}
