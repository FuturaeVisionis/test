package polymorphismWithClasses;
import static java.lang.System.out;

/**
 * Created by ronald on 02/11/16.
 * POLYMORPHISM comes into the picture when a class INHERITS another class and both the base and the derived classes
 * DEFINE methods with the same method signature (same method name and method PARAMETERS). --> method overriding!
 */

abstract class Employee {


    public static void reachOffice() {
        out.println("reached office - Gurgaon, India");

    }

    public abstract void startProjectWork(); // 1.The modifier here can be either the same or less restrictive than the
                                             // overwritten method!!
                                             // 2.An overwritten method defined in the base class can be an abstract method
                                             // or a non-abstract method.
                                             // 3.The name and the arguments of the overwritten method must be the same.
                                             // ## POLYMORPHIC METHODS DON'T HAVE TO BE ABSTRACT!! ##
                                             // Overloaded methods have nothing to do with polymorphism.

}
/**
 * A abstract class can have concrete and abstract methods.
 * A abstract class CAN NOT BE INSTANTIATED.
 * A concrete class can NOT define a abstract method!!
 * A abstract method doesn't have a body.
 * A abstract Interface is abstract by entity.
 * A abstract method doesn't have curly braces at the end.
 * A variable of no kind can be declared abstract.
 */
