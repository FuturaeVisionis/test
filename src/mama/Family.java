package mama;

/**
 * Created by ronald on 02/11/16.
 */
public class Family {
    public static void main(String[] args) {
        Child child = new Child();
        child.hair(); // this is inheritance (method is unchanged)
        child.teeth(); // this is polymorphism (overriding the method)

    }
}
